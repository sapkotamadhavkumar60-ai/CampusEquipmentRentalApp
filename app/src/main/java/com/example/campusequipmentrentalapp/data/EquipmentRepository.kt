package com.example.campusequipmentrentalapp.data

import com.example.campusequipmentrentalapp.model.Equipment
import com.example.campusequipmentrentalapp.model.RentalStatus

// Sample data repository to use instead of a database
object EquipmentRepository {

    val equipmentList :List<Equipment> = listOf(
        Equipment(
            id = 1,
            name = "Laptop",
            category = "Computer",
            icon = "💻",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 3,
            location = "Media Hall #604",
            description = "Windows laptop suitable for class presentations and team projects."
        ),
        Equipment(
            id = 2,
            name = "Tablet",
            category = "Mobile",
            icon = "📱",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 2,
            location = "Media Hall #604",
            description = "Android tablet suitable for note-taking, e-books, and mobile app testing."
        ),
        Equipment(
            id = 3,
            name = "Webcam",
            category = "Video",
            icon = "📷",
            status = RentalStatus.RENTED,
            maxRentalDays = 3,
            location = "Department Office",
            description = "Full HD webcam suitable for online presentations and video recording."
        ),
        Equipment(
            id = 4,
            name = "Tripod",
            category = "Photography",
            icon = "🎬",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 5,
            location = "Media Hall #605",
            description = "Height-adjustable tripod suitable for smartphones and compact cameras."
        ),
        Equipment(
            id = 5,
            name = "Projector",
            category = "Presentation",
            icon = "📽️",
            status = RentalStatus.MAINTENANCE,
            maxRentalDays = 1,
            location = "Department Office",
            description = "Portable projector suitable for team presentations and events. Currently under maintenance."
        ),
        Equipment(
            id = 6,
            name = "VR Device",
            category = "Immersive Media",
            icon = "🥽",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 1,
            location = "AI Lab",
            description = "Standalone VR device used for VR content experiences and capstone project testing."
        ),
        Equipment(
            id = 7,
            name = "Wireless Microphone",
            category = "Audio",
            icon = "🎤",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 2,
            location = "Department Office",
            description = "Rechargeable wireless microphone suitable for presentations, recording, and event hosting."
        ),
        Equipment(
            id = 8,
            name = "Portable Speaker",
            category = "Audio",
            icon = "🔊",
            status = RentalStatus.RENTED,
            maxRentalDays = 2,
            location = "Department Office",
            description = "Bluetooth speaker suitable for small events and project demonstrations."
        )



    )
    fun findById(id:Int) : Equipment ?= equipmentList.find{ equipment -> equipment.id == id}


}







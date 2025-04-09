package com.example.sleepwell.model.cases

import com.example.sleepwell.view.adapters.ItemList


data class Case (
    val id: Long,
    var comment: String,
    var date: Long,
    val habitId: Long
) : ItemList
package com.example.sleepwell.model.graph

import com.example.sleepwell.view.adapters.ItemList
import java.util.Date

data class Graph(
    val data: MutableMap<Date, Int>
) : ItemList
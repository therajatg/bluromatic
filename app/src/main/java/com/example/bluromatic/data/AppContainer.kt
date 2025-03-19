package com.example.bluromatic.data

import android.content.Context

interface AppContainer {
    val bluromaticRepository: BluromaticRepository
}

class DefaultAppContainer(context: Context): AppContainer {
    override val bluromaticRepository = WorkManagerBluromaticRepository(context)
}


//The repository thing provides all the values that are needed for the app to run.
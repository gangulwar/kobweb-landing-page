package com.gangulwar.util

import com.varabyte.kobweb.compose.ui.graphics.Color

object Resources {
    object Image {
        const val PROFILE_PHOTO = "display_image.png"
        const val RAINBOW_IMAGE = "rainbow_shape.png"
    }


    object Dimens {
        const val BORDER_RADIUS = 8
        const val MAX_CARD_WIDTH = 600
        const val MAX_CARD_HEIGHT = 600
        const val ICON_SIZE = 24
        const val ICON_SIZE_LG = 32
    }


    enum class Theme(val color: Color) {
        GET_STARTED(color = Color.rgb(32, 32, 32)),
        BACKGROUND(color = Color.rgb(253, 254, 255))
    }

    object String{
        const val ZillaSlabBold="ZillaSlabBold"
        const val InterRegular="InterRegular"
    }
}
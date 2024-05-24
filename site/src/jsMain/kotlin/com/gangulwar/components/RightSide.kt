package com.gangulwar.components

import androidx.compose.runtime.Composable
import com.gangulwar.util.Resources
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh

@Composable
fun RightSide(breakpoint: Breakpoint) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .thenIf(
                condition = breakpoint >= Breakpoint.MD,
                other = Modifier
                    .height(
                        95.vh
                    )
                    .width(
                        Resources.Dimens.MAX_IMAGE_WIDTH.px
                    )
            )
    ) {
        Image(
            modifier = Modifier
                .fillMaxSize()
                .objectFit(ObjectFit.Fill),
            src = Resources.Image.PROFILE_PHOTO
        )
    }
}
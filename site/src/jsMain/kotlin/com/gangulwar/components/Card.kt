package com.gangulwar.components

import androidx.compose.runtime.Composable
import com.gangulwar.util.Resources
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.FlexDirection.Companion.Row
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun ProfileCard(colorMode: ColorMode) {
    val breakpoint = rememberBreakpoint()

    Row (
        modifier = Modifier.padding (
            leftRight = 75.px,
            top = 25.px),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically){
        LeftSide(colorMode = colorMode, breakpoint = breakpoint)
        RightSide(breakpoint = breakpoint)
    }


}
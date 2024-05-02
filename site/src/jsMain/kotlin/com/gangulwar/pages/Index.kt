package com.gangulwar.pages

import androidx.compose.runtime.*
import com.gangulwar.components.LeftSide
import com.gangulwar.components.ProfileCard
import com.gangulwar.components.RightSide
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {

    val breakpoint = rememberBreakpoint()
    var colorMode by ColorMode.currentState

    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        ProfileCard(colorMode)
    }
}

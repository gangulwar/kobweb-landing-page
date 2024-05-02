package com.gangulwar

import androidx.compose.runtime.*
import com.gangulwar.util.Resources
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.palette.button
import org.jetbrains.compose.web.css.*

@App
@Composable
fun AppEntry(content: @Composable () -> Unit) {
    SilkApp {
        Surface(SmoothColorStyle.toModifier().minHeight(100.vh)) {
            content()
        }
    }
}


@InitSilk
fun overrideSilkTheme(context: InitSilkContext) {
    context.apply {
        theme.palettes.apply {
            light.apply {
                button.apply {
                    default = Resources.Theme.GET_STARTED.color
                    hover = Resources.Theme.GET_STARTED.color
                    pressed = Resources.Theme.GET_STARTED.color
                }
            }

            dark.apply {
                button.apply {
                    default = Resources.Theme.GET_STARTED.color
                    hover = Resources.Theme.GET_STARTED.color
                    pressed = Resources.Theme.GET_STARTED.color
                }
            }
        }
    }
}
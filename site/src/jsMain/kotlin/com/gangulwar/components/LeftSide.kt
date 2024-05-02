package com.gangulwar.components

import androidx.compose.runtime.Composable
import com.gangulwar.util.Resources
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.px
import com.varabyte.kobweb.silk.components.forms.Button
import org.jetbrains.compose.web.css.AlignContent

@Composable
fun LeftSide(colorMode: ColorMode, breakpoint: Breakpoint) {

    Column(horizontalAlignment = Alignment.Start) {
        Image(
            src = Resources.Image.RAINBOW_IMAGE,
        )

        SpanText(
            "Bringing your community together",
            modifier = Modifier
                .margin(bottom = 50.px)
                .fontFamily(Resources.String.ZillaSlabBold)
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                .fontSize(50.px)
                .fontWeight(FontWeight.Bold)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )

        SpanText(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Faucibus in libero risus semper habitant arcu eget. Et integer facilisi eget.",
            modifier = Modifier
                .margin(bottom = 50.px)
                .fontFamily(Resources.String.InterRegular)
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                .fontSize(23.px)
                .fontWeight(FontWeight.Normal)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )

        Button(
            modifier = Modifier.size(width = 200.px, height = 65.px)
                .backgroundColor(Colors.Black)
                .alignContent(AlignContent.Center),
            onClick = {

            }) {


            SpanText(
                "Get Started",
                modifier = Modifier
                    .fillMaxSize()
                    .margin(bottom = 50.px)
                    .fontFamily(Resources.String.InterRegular)
                    .color(Colors.White)
                    .fontSize(23.px)
                    .fontWeight(FontWeight.Normal)
                    .textAlign(
                        TextAlign.Center
                    )
            )

        }

    }
}
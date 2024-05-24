package com.gangulwar.components

import androidx.compose.runtime.Composable
import com.gangulwar.util.Resources
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
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
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.LineStyle
import com.varabyte.kobweb.compose.ui.graphics.Color

@Composable
fun LeftSide(colorMode: ColorMode, breakpoint: Breakpoint) {

    val paddingModifier = if (breakpoint >= Breakpoint.MD) {
        Modifier.padding(right = 50.px)
    } else {
        Modifier.padding(all = 50.px)
    }

    Column(
        modifier = Modifier.fillMaxSize()
            .then(paddingModifier)
            .margin(top = 50.px)
        ,
        horizontalAlignment = if (breakpoint >= Breakpoint.MD) {
            Alignment.Start
        } else {
            Alignment.CenterHorizontally
        }
    ) {

        Image(
            modifier = Modifier.padding(bottom = 25.px),
            src = Resources.Image.RAINBOW_IMAGE,
        )

        SpanText(
            "Bringing your community together",
            modifier = Modifier
                .margin(bottom = 25.px)
                .fontFamily(Resources.String.RobotoSlabBold)
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                .fontSize(50.px)
                .fontWeight(FontWeight.Bold)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )

        SpanText(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam fermentum finibus elit scelerisque auctor. Mauris pulvinar vitae risus eu congue. Suspendisse potenti. In sed justo suscipit, varius ex in, tristique nunc. Donec sit amet aliquam purus. Nullam consectetur scelerisque mollis.",
            modifier = Modifier
                .margin(bottom = 10.px)
                .fontFamily(Resources.String.InterRegular)
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                .fontSize(15.px)
                .fontWeight(FontWeight.Normal)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )

        Button(
            modifier = Modifier
                .size(width = 200.px, height = 60.px)
                .backgroundColor(Colors.Black)
                .alignContent(
                    AlignContent.Center
                )
                .borderRadius(40.px)
                .margin(top = 15.px, bottom = 15.px),
            onClick = {

            }
        ) {

            SpanText(
                "Get Started",
                modifier = Modifier
                    .fontFamily(Resources.String.InterRegular)
                    .color(Colors.White)
                    .fontSize(20.px)
                    .fontWeight(FontWeight.Normal)
                    .textAlign(
                        TextAlign.Center
                    )
            )

        }

        Box(
            modifier = Modifier.border(
                width = 3.px,
                style = LineStyle.Solid,
                color = Colors.Black
            )
                .margin(top = 25.px)
                .padding(all = 15.px)
                .boxShadow(
                    offsetX = 10.px,
                    offsetY = 10.px,
                    color = Colors.Black
                )
        ) {

            Box(
                modifier = Modifier
                    .backgroundColor(Color.rgb(51, 51, 51))
                    .padding(15.px)
            ) {
                SpanText(
                    "“The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.”",
                    modifier = Modifier
                        .fontFamily(Resources.String.InterRegular)
                        .color(Colors.White)
                        .fontSize(15.px)
                        .fontWeight(FontWeight.Light)
                        .textAlign(
                            TextAlign.Start
                        )
                )
            }

        }

        Image(
            modifier = Modifier.margin(top = 75.px),
            src = Resources.Image.SOCIAL_MEDIA,
        )

    }
}
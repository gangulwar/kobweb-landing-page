package com.gangulwar.components

import androidx.compose.runtime.Composable
import com.gangulwar.util.Resources
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun ProfileCard(colorMode: ColorMode,breakpoint: Breakpoint) {

    SimpleGrid(
        numColumns = numColumns(base = 1, md = 2),
        modifier = Modifier
            .margin (all = 15.px)
            .fillMaxWidth(
                if (breakpoint <= Breakpoint.MD) 100.percent
                else Resources.Dimens.MAX_CARD_WIDTH.px
            )
            .thenIf(
                condition = breakpoint > Breakpoint.MD,
                other = Modifier.height(
                    (Resources.Dimens.MAX_CARD_HEIGHT).px
                ).width(
                    (Resources.Dimens.MAX_CARD_WIDTH).px
                )
            )

    ) {
        LeftSide(colorMode = colorMode, breakpoint = breakpoint)
        RightSide(breakpoint = breakpoint)
    }

//    Row (
//        modifier = Modifier.padding (
//            leftRight = 75.px,
//            top = 25.px),
//        horizontalArrangement = Arrangement.SpaceEvenly,
//        verticalAlignment = Alignment.CenterVertically){
//
//    }


}
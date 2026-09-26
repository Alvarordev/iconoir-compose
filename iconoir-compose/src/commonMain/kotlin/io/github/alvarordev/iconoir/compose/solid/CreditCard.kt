// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/solid/credit-card.svg. Do not edit.
package io.github.alvarordev.iconoir.compose.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.alvarordev.iconoir.compose.Iconoir

public val Iconoir.Solid.CreditCard: ImageVector
    get() = creditcardVector.value

private object creditcardVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "solid/credit-card", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(4f, 4.25f),
                PathNode.CurveTo(2.48122f, 4.25f, 1.25f, 5.48122f, 1.25f, 7f),
                PathNode.VerticalTo(17f),
                PathNode.CurveTo(1.25f, 18.5188f, 2.48122f, 19.75f, 4f, 19.75f),
                PathNode.HorizontalTo(20f),
                PathNode.CurveTo(21.5188f, 19.75f, 22.75f, 18.5188f, 22.75f, 17f),
                PathNode.VerticalTo(9.75f),
                PathNode.HorizontalTo(6f),
                PathNode.CurveTo(5.58579f, 9.75f, 5.25f, 9.41421f, 5.25f, 9f),
                PathNode.CurveTo(5.25f, 8.58579f, 5.58579f, 8.25f, 6f, 8.25f),
                PathNode.HorizontalTo(22.75f),
                PathNode.VerticalTo(7f),
                PathNode.CurveTo(22.75f, 5.48122f, 21.5188f, 4.25f, 20f, 4.25f),
                PathNode.HorizontalTo(4f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.EvenOdd,
            fill = SolidColor(Color.Black),
            stroke = null,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}

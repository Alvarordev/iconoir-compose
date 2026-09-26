// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/credit-card.svg. Do not edit.
package io.github.alvarordev.iconoir.compose.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.alvarordev.iconoir.compose.Iconoir

public val Iconoir.Regular.CreditCard: ImageVector
    get() = creditcardVector.value

private object creditcardVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/credit-card", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(22f, 9f),
                PathNode.VerticalTo(17f),
                PathNode.CurveTo(22f, 18.1046f, 21.1046f, 19f, 20f, 19f),
                PathNode.HorizontalTo(4f),
                PathNode.CurveTo(2.89543f, 19f, 2f, 18.1046f, 2f, 17f),
                PathNode.VerticalTo(7f),
                PathNode.CurveTo(2f, 5.89543f, 2.89543f, 5f, 4f, 5f),
                PathNode.HorizontalTo(20f),
                PathNode.CurveTo(21.1046f, 5f, 22f, 5.89543f, 22f, 7f),
                PathNode.VerticalTo(9f),
                PathNode.Close,
                PathNode.MoveTo(22f, 9f),
                PathNode.HorizontalTo(6f),
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}

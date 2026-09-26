// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/triangle-flag-circle.svg. Do not edit.
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

public val Iconoir.Regular.TriangleFlagCircle: ImageVector
    get() = triangleflagcircleVector.value

private object triangleflagcircleVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/triangle-flag-circle", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(9f, 21.5f),
                PathNode.VerticalTo(15.5f),
                PathNode.MoveTo(9f, 15.5f),
                PathNode.VerticalTo(6.99654f),
                PathNode.CurveTo(9f, 6.5444f, 9.48113f, 6.25472f, 9.88073f, 6.46627f),
                PathNode.LineTo(16.5505f, 9.99731f),
                PathNode.CurveTo(16.9654f, 10.217f, 16.9787f, 10.8067f, 16.5739f, 11.0447f),
                PathNode.LineTo(9f, 15.5f),
                PathNode.Close,
                PathNode.MoveTo(22f, 12f),
                PathNode.CurveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f),
                PathNode.CurveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f),
                PathNode.CurveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f),
                PathNode.CurveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f),
                PathNode.Close,
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

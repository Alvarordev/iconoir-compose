// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/keyframe.svg. Do not edit.
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

public val Iconoir.Regular.Keyframe: ImageVector
    get() = keyframeVector.value

private object keyframeVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/keyframe", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(20.777f, 13.3453f),
                PathNode.LineTo(13.4799f, 21.3721f),
                PathNode.CurveTo(12.6864f, 22.245f, 11.3136f, 22.245f, 10.5201f, 21.3721f),
                PathNode.LineTo(3.22304f, 13.3453f),
                PathNode.CurveTo(2.52955f, 12.5825f, 2.52955f, 11.4175f, 3.22304f, 10.6547f),
                PathNode.LineTo(10.5201f, 2.62787f),
                PathNode.CurveTo(11.3136f, 1.755f, 12.6864f, 1.755f, 13.4799f, 2.62787f),
                PathNode.LineTo(20.777f, 10.6547f),
                PathNode.CurveTo(21.4705f, 11.4175f, 21.4705f, 12.5825f, 20.777f, 13.3453f),
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

package com.zephyr.constraintlayoutdemo

/**
 * created by zephyr on 3/31/21 11 : 06
 *
 */

const val BASELINE_EXPLAIN = "两个TextView高度不一致，但是又希望文本对齐，这个时候可以使用 layout_constraintBaseline_toBaselineOf "

const val CIRCLE_EXPLAIN = "角度定位指的是可以用一个角度和一个距离来约束两个控件的中心。" +
        "首先要有一个基准View, 然后目标View使用layout_constraintCircle： 角度定位相对的另一个控件的id" +
        "layout_constraintCircleRadius： 到相对控件中心的距离" +
        "layout_constraintCircleAngle： 控件相对于另一个控件的角度，来进行定位。"

const val GONE_MARGIN_EXPLAIN = "设置了goneMargin的View，当约束它的View被gone以后，将会为当前View添加Margin效果"

const val CONSTRAINT_HORIZONTAL_EXPLAIN = "假如现在要实现水平偏移，给TextView的layout_constraintHorizontal_bias赋一个范围为 0-1 的值，" +
        "假如赋值为0，则TextView在布局的最左侧，假如赋值为1，则TextView在布局的最右侧，假如假如赋值为0.5，则水平居中，假如假如赋值为0.3，则更倾向于左侧。" +
        "垂直偏移同理"

const val DIMENSION_RATIO = "当宽或高至少有一个尺寸被设置为0dp时，可以通过属性layout_constraintDimensionRatio设置宽高比," +
        "app:layout_constraintDimensionRatio=\"1:1\" 表示宽高比为1：1，也可以通过在设置时加上W或者H指定宽高比或者高宽比，如下：" +
        "app:layout_constraintDimensionRatio=\"H,2:3\"指的是 高:宽=2:3\n" +
        "app:layout_constraintDimensionRatio=\"W,2:3\"指的是 宽:高=2:3\n" +
        "哪个为0，哪个变化，不为0的始终不变"

const val CHAIN_EXPLAIN = "如果两个或者两个以上的控件依次相互约束在一起，如图所示，那么就可以任务他们是一条链，链的第一个控件" +
        "叫做链头，可以通过layout_constraintHorizontal_chainStyle来改变整条链的样式。样式有如下三种：" +
        "1. spread -> 链中的控件均匀展开，彼此间隔还有和屏幕边缘间隔相同" +
        "2. spread_inside -> 链中的控件均匀展开，彼此之间间隔相同，但是开始和结束的控件紧贴屏幕边缘" +
        "3. packet -> 链中的元素将会被打包在一起，并且左右间隔屏幕距离相同."

const val WEIGHT_CHAIN_EXPLAIN = "权重链和上面提到的链一样，都必须依次相互约束，然后可以通过app:layout_constraintHorizontal_weight" +
        "来设置权重，垂直和水平同理。这样就能实现Linearlayout中通过gravity设置权重的效果了。"


const val BARRIER_EXPLAIN = "Barrier解决了控件宽度可变情况下的对齐问题，如例子，当左侧有两个宽度可变的控件时，右侧的控件需要始终在他们中" +
        "最宽的控件的右侧，如果单纯依赖其中一个控件则无法实现这样的效果，为了使右侧控件能被左侧最宽的控件约束，就可以使用barrier，它有两个重要" +
        "属性， app:barrierDirection=\"right\" 用来指示约束屏障的位置，app:constraint_referenced_ids=\"TextView1,TextView2\" 为其" +
        "创建屏障所引用的控件 "


const val GROUP_EXPLAIN = "Group用于同时处理多个控件的可见性，它本身是不可见的，我们可以使用属性 app:constraint_referenced_ids=\"TextView1,TextView3\"" +
        " 来设置引用的控件， android:visibility=\"invisible\" 可以设置默认的可见性，当需要改变它所引用的多个控件的可见性时，我们只需要在代码中修改" +
        "Group的visibility就可以了，非常方便。实际上上边的Barrier也是提供了同时处理多个控件的解决方案，只不过Barrier处理的是在控价尺寸可变情况下的对齐问题。"

const val PLACEHOLDER_EXPLAIN = "placeholder顾名思义，就是占位符的意思，本身不显示，可以通过setContentId(viewId)来设置在它的位置上显示的控件，因此" +
        "我们可以在代码中变换它所引用的控件，达到移动控件的效果，非常实用."

const val GUIDELINE_EXPLAIN = "guideline就是引导线，本身不可见。可以用来约束其它控件，它提供了以下的属性 android:orientation=\"vertical\" 指示引导线的方向，" +
        "app:layout_constraintGuide_begin=\"20dp\" 距离屏幕左侧或者上侧边缘的距离，同样的还有app:layout_constraintGuide_end=\"20dp\"，距离右侧或者下侧的距离，" +
        "另外还提供了通过百分比设置距离的方法 app:layout_constraintGuide_percent=\"0.5\"。 需要注意的是margin等方法在引导线上不起作用，你只需要使用它提供的方法来" +
        "设置引导线的位置即可。 当使用引导线时，其它控件只需要将他当做普通的控件来约束即可。"
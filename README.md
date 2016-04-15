:running:BGAImageView-Android:running:
============

* 使用v4包中的RoundedBitmapDrawable实现圆角矩形、圆形
* 描边圆形
* 根据宽度确定高度的正方形

### 效果图

![Image of BGAImageViewDemo](http://7xk9dj.com1.z0.glb.clouddn.com/imageview/bgaimageview.jpg?imageView2/2/w/320)

### Gradle依赖 [![Maven Central](https://maven-badges.herokuapp.com/maven-central/cn.bingoogolapple/bga-imageview/badge.svg)](https://maven-badges.herokuapp.com/maven-central/cn.bingoogolapple/bga-imageview) ***「latestVersion」指的是左边这个 maven-central 徽章后面的「数字」，请自行替换。***

```groovy
dependencies {
    compile 'com.android.support:support-v4:latestVersion'
    compile 'cn.bingoogolapple:bga-imageview:latestVersion@aar'
}
```

### 自定义属性说明

```xml
<!-- 默认图片资源，默认为null -->
<attr name="android:src" />
<!-- 是否是圆形，默认值为false -->
<attr name="bga_iv_isCircle" format="boolean" />
<!-- 圆角矩形的半径，默认值为0dp -->
<attr name="bga_iv_cornerRadius" format="reference|dimension" />
<!-- 是否是矩形，默认值为false -->
<attr name="bga_iv_isSquare" format="boolean" />
<!-- 描边的宽度，默认值为0dp -->
<attr name="bga_iv_borderWidth" format="reference|dimension" />
<!-- 描边的颜色，默认值为Color.WHITE -->
<attr name="bga_iv_borderColor" format="reference|color" />
```

### 关于我

| 新浪微博 | 个人主页 | 邮箱 | BGA系列开源库QQ群 |
| ------------ | ------------- | ------------ | ------------ |
| <a href="http://weibo.com/bingoogol" target="_blank">bingoogolapple</a> | <a  href="http://www.bingoogolapple.cn" target="_blank">bingoogolapple.cn</a>  | <a href="mailto:bingoogolapple@gmail.com" target="_blank">bingoogolapple@gmail.com</a> | ![BGA_CODE_CLUB](http://7xk9dj.com1.z0.glb.clouddn.com/BGA_CODE_CLUB.png?imageView2/2/w/200) |

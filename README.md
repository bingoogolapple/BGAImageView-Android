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

## 作者联系方式

| 个人主页 | 邮箱 |
| ------------- | ------------ |
| <a  href="https://www.bingoogolapple.cn" target="_blank">bingoogolapple.cn</a>  | <a href="mailto:bingoogolapple@gmail.com" target="_blank">bingoogolapple@gmail.com</a> |

| 个人微信号 | 微信群 | 公众号 |
| ------------ | ------------ | ------------ |
| <img width="180" alt="个人微信号" src="https://github.com/bingoogolapple/bga-god-assistant-config/raw/main/images/BGAQrCode.png"> | <img width="180" alt="微信群" src="https://github.com/bingoogolapple/bga-god-assistant-config/raw/main/images/WeChatGroup1QrCode.jpg"> | <img width="180" alt="公众号" src="https://github.com/bingoogolapple/bga-god-assistant-config/raw/main/images/GongZhongHao.png"> |

| 个人 QQ 号 | QQ 群 |
| ------------ | ------------ |
| <img width="180" alt="个人 QQ 号" src="https://github.com/bingoogolapple/bga-god-assistant-config/raw/main/images/BGAQQQrCode.jpg"> | <img width="180" alt="QQ 群" src="https://github.com/bingoogolapple/bga-god-assistant-config/raw/main/images/QQGroup1QrCode.jpg"> |

## 打赏支持作者

如果您觉得 BGA 系列开源库或工具软件帮您节省了大量的开发时间，可以扫描下方的二维码打赏支持。您的支持将鼓励我继续创作，打赏后还可以加我微信免费开通一年 [上帝小助手浏览器扩展/插件开发平台](https://github.com/bingoogolapple/bga-god-assistant-config) 的会员服务

| 微信 | QQ | 支付宝 |
| ------------- | ------------- | ------------- |
| <img width="180" alt="微信" src="https://github.com/bingoogolapple/bga-god-assistant-config/raw/main/images/donate-wechat.jpg"> | <img width="180" alt="QQ" src="https://github.com/bingoogolapple/bga-god-assistant-config/raw/main/images/donate-qq.jpg"> | <img width="180" alt="支付宝" src="https://github.com/bingoogolapple/bga-god-assistant-config/raw/main/images/donate-alipay.jpg"> |

## 作者项目推荐

* 欢迎您使用我开发的第一个独立开发软件产品 [上帝小助手浏览器扩展/插件开发平台](https://github.com/bingoogolapple/bga-god-assistant-config)

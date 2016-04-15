package cn.bingoogolapple.imageview.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import cn.bingoogolapple.imageview.BGAImageView;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:16/4/11 下午19:32
 * 描述:
 */
public class MainActivity extends AppCompatActivity {
    private BGAImageView mTest1Iv;
    private BGAImageView mTest2Iv;
    private BGAImageView mTest3Iv;
    private BGAImageView mTest4Iv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTest1Iv = (BGAImageView) findViewById(R.id.iv_main_test1);
        mTest2Iv = (BGAImageView) findViewById(R.id.iv_main_test2);
        mTest3Iv = (BGAImageView) findViewById(R.id.iv_main_test3);
        mTest4Iv = (BGAImageView) findViewById(R.id.iv_main_test4);

        int maxSize = getResources().getDimensionPixelSize(R.dimen.max_size);

        Glide.with(this).load("http://7xk9dj.com1.z0.glb.clouddn.com/refreshlayout/images/staggered6.png").asBitmap().placeholder(R.mipmap.holder).error(R.mipmap.holder).override(maxSize, maxSize).into(mTest1Iv);
        Glide.with(this).load("http://7xk9dj.com1.z0.glb.clouddn.com/refreshlayout/images/staggered7.png").asBitmap().placeholder(R.mipmap.holder).error(R.mipmap.holder).override(maxSize, maxSize).into(mTest2Iv);
        Glide.with(this).load("http://7xk9dj.com1.z0.glb.clouddn.com/refreshlayout/images/staggered8.png").asBitmap().placeholder(R.mipmap.holder).error(R.mipmap.holder).into(mTest3Iv);
        Glide.with(this).load("http://7xk9dj.com1.z0.glb.clouddn.com/refreshlayout/images/staggered9.png").asBitmap().placeholder(R.mipmap.holder).error(R.mipmap.holder).into(mTest4Iv);
    }
}

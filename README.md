#使用bugly的热更新demo
## 使用步骤
1. 在项目的build.gradle中添加 
    ~~~
    classpath "com.tencent.bugly:tinker-support:1.1.0"
    ~~~
2. 在app的build.gradle中添加
    ~~~
    compile "com.android.support:multidex:1.0.1" // 多dex配置
    compile 'com.tencent.bugly:crashreport_upgrade:1.3.3'
    ~~~
3. 添加 tinker-support.gradle 文件 注意看：![效果图](/images/image1.png)
4. 自定义Application(MyApplication) 和 ApplicationLike
5. 具体生成步骤：https://bugly.qq.com/docs/user-guide/instruction-manual-android-hotfix-demo/

package demotest.cmeplaza.com.buglyztest;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by klx on 2017/11/23.
 */

public class MyApplication extends TinkerApplication {

    public MyApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "demotest.cmeplaza.com.buglyztest.MyApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}

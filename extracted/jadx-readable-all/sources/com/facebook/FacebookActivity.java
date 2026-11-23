package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.HashSet;
import mtp.media.karaoke.R;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.FacebookDialogFragment;
import p007c.p165l.p178k0.NativeProtocol;
import p007c.p165l.p182l0.LoginFragment;
import p007c.p165l.p183m0.p184b.DeviceShareDialogFragment;
import p007c.p165l.p183m0.p185c.ShareContent;
import p636z0.p752p.p753c.BackStackRecord;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p752p.p753c.FragmentManager;

/* JADX INFO: loaded from: classes.dex */
public class FacebookActivity extends FragmentActivity {

    /* JADX INFO: renamed from: t */
    public static final String f28291t = FacebookActivity.class.getName();

    /* JADX INFO: renamed from: u */
    public Fragment f28292u;

    @Override // p636z0.p752p.p753c.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.f28292u;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        Fragment fragment;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!FacebookSdk.m2664f()) {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            FacebookSdk.m2667i(getApplicationContext());
        }
        setContentView(R.layout.com_facebook_activity_layout);
        if ("PassThrough".equals(intent.getAction())) {
            setResult(0, NativeProtocol.m2540d(getIntent(), null, NativeProtocol.m2543g(NativeProtocol.m2546j(getIntent()))));
            finish();
            return;
        }
        Intent intent2 = getIntent();
        FragmentManager fragmentManagerM16577C = m16577C();
        Fragment fragmentM16656I = fragmentManagerM16577C.m16656I("SingleFragment");
        if (fragmentM16656I == null) {
            if ("FacebookDialogFragment".equals(intent2.getAction())) {
                fragment = fragmentM16656I;
                FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
                facebookDialogFragment.m16551S0(true);
                facebookDialogFragment.mo5469c1(fragmentManagerM16577C, "SingleFragment");
                fragment = facebookDialogFragment;
            } else if ("DeviceShareDialogFragment".equals(intent2.getAction())) {
                fragment = fragmentM16656I;
                DeviceShareDialogFragment deviceShareDialogFragment = new DeviceShareDialogFragment();
                deviceShareDialogFragment.m16551S0(true);
                deviceShareDialogFragment.f5195y0 = (ShareContent) intent2.getParcelableExtra("content");
                deviceShareDialogFragment.mo5469c1(fragmentManagerM16577C, "SingleFragment");
                fragment = deviceShareDialogFragment;
            } else {
                fragment = fragmentM16656I;
                LoginFragment loginFragment = new LoginFragment();
                loginFragment.m16551S0(true);
                BackStackRecord backStackRecord = new BackStackRecord(fragmentManagerM16577C);
                backStackRecord.mo16448g(R.id.com_facebook_fragment_container, loginFragment, "SingleFragment", 1);
                backStackRecord.mo16444c();
                fragment = loginFragment;
            }
        }
        fragment = fragmentM16656I;
        this.f28292u = fragment;
    }
}

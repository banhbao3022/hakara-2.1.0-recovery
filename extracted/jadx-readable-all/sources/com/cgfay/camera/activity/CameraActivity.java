package com.cgfay.camera.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;
import mtp.media.karaoke.R;
import p007c.p114h.p115a.p117b.CameraPreviewFragment2;
import p007c.p114h.p115a.p119d.CameraPreviewPresenter;
import p007c.p114h.p145f.p146b.HWMediaRecorder;
import p636z0.p644b.p645c.AppCompatActivity;
import p636z0.p752p.p753c.BackStackRecord;

/* JADX INFO: loaded from: classes.dex */
public class CameraActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: u */
    public CameraPreviewFragment2 f28149u;

    /* JADX INFO: renamed from: v */
    public BroadcastReceiver f28150v = new C5778a();

    /* JADX INFO: renamed from: com.cgfay.camera.activity.CameraActivity$a */
    public class C5778a extends BroadcastReceiver {
        public C5778a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CameraPreviewFragment2 cameraPreviewFragment2;
            HWMediaRecorder hWMediaRecorder;
            if (intent.getAction().equals("android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
                String stringExtra = intent.getStringExtra("reason");
                if (TextUtils.isEmpty(stringExtra) || !stringExtra.equals("homekey") || (cameraPreviewFragment2 = (CameraPreviewFragment2) CameraActivity.this.m16577C().m16656I("fragment_camera")) == null) {
                    return;
                }
                CameraPreviewPresenter cameraPreviewPresenter = cameraPreviewFragment2.f3876l0;
                if (cameraPreviewPresenter.f3896g && (hWMediaRecorder = cameraPreviewPresenter.f3901l) != null && hWMediaRecorder.m2200a()) {
                    CameraPreviewPresenter cameraPreviewPresenter2 = cameraPreviewFragment2.f3876l0;
                    if (cameraPreviewPresenter2.f3896g) {
                        cameraPreviewPresenter2.f3896g = false;
                        HWMediaRecorder hWMediaRecorder2 = cameraPreviewPresenter2.f3901l;
                        if (hWMediaRecorder2 != null) {
                            cameraPreviewPresenter2.f3897h = false;
                            hWMediaRecorder2.m2204e();
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        CameraPreviewFragment2 cameraPreviewFragment2 = this.f28149u;
        if (cameraPreviewFragment2 == null || !cameraPreviewFragment2.m2069Z0()) {
            this.f143l.m133b();
            overridePendingTransition(0, R.anim.anim_slide_down);
        }
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_camera);
        if (bundle == null && this.f28149u == null) {
            this.f28149u = new CameraPreviewFragment2();
            BackStackRecord backStackRecord = new BackStackRecord(m16577C());
            backStackRecord.m16506i(R.id.fragment_container, this.f28149u, "fragment_camera");
            backStackRecord.mo16444c();
        }
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        unregisterReceiver(this.f28150v);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x011e  */
    @Override // p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onResume() {
        int iIntValue;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        WindowInsets rootWindowInsets;
        boolean z;
        super.onResume();
        if ("Xiaomi".equals(Build.MANUFACTURER)) {
            try {
                Class<?> clsLoadClass = getClassLoader().loadClass("android.os.SystemProperties");
                iIntValue = ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, new String("ro.miui.notch"), new Integer(0))).intValue();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                iIntValue = 0;
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                iIntValue = 0;
            } catch (IllegalArgumentException e3) {
                e3.printStackTrace();
                iIntValue = 0;
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
                iIntValue = 0;
            } catch (InvocationTargetException e5) {
                e5.printStackTrace();
                iIntValue = 0;
            }
        } else {
            iIntValue = 0;
        }
        try {
            if (iIntValue != 1) {
                try {
                    try {
                        Class<?> clsLoadClass2 = getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                        zBooleanValue = ((Boolean) clsLoadClass2.getMethod("hasNotchInScreen", new Class[0]).invoke(clsLoadClass2, new Object[0])).booleanValue();
                    } catch (Exception unused) {
                        Log.e("Notch", "hasNotchAtHuawei Exception");
                        zBooleanValue = false;
                    }
                } catch (ClassNotFoundException unused2) {
                    Log.e("Notch", "hasNotchAtHuawei ClassNotFoundException");
                    zBooleanValue = false;
                } catch (NoSuchMethodException unused3) {
                    Log.e("Notch", "hasNotchAtHuawei NoSuchMethodException");
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    try {
                        if (!getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism")) {
                            try {
                                try {
                                    Class<?> clsLoadClass3 = getClassLoader().loadClass("android.util.FtFeature");
                                    zBooleanValue2 = ((Boolean) clsLoadClass3.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass3, 32)).booleanValue();
                                } catch (NoSuchMethodException unused4) {
                                    Log.e("Notch", "hasNotchAtVivo NoSuchMethodException");
                                    zBooleanValue2 = false;
                                }
                            } catch (ClassNotFoundException unused5) {
                                Log.e("Notch", "hasNotchAtVivo ClassNotFoundException");
                                zBooleanValue2 = false;
                            } catch (Exception unused6) {
                                Log.e("Notch", "hasNotchAtVivo Exception");
                                zBooleanValue2 = false;
                            }
                            if (!zBooleanValue2) {
                                View decorView = getWindow().getDecorView();
                                if (((decorView == null || Build.VERSION.SDK_INT < 28 || (rootWindowInsets = decorView.getRootWindowInsets()) == null) ? null : rootWindowInsets.getDisplayCutout()) == null) {
                                    int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
                                    z = (identifier > 0 ? getResources().getDimensionPixelSize(identifier) : 0) >= 80;
                                }
                            }
                        }
                    } catch (Throwable unused7) {
                    }
                }
            }
        } catch (Throwable unused8) {
        }
        if (z && Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        registerReceiver(this.f28150v, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }
}

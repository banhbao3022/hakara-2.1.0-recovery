package com.cgfay.camera.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Objects;
import mtp.media.karaoke.R;
import p007c.p114h.p115a.p116a.CameraParam;
import p636z0.p644b.p645c.AppCompatActivity;

/* JADX INFO: loaded from: classes.dex */
public class CameraSettingActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ int f28152u = 0;

    /* JADX INFO: renamed from: A */
    public View.OnClickListener f28153A = new ViewOnClickListenerC5779a();

    /* JADX INFO: renamed from: v */
    public RelativeLayout f28154v;

    /* JADX INFO: renamed from: w */
    public RelativeLayout f28155w;

    /* JADX INFO: renamed from: x */
    public TextView f28156x;

    /* JADX INFO: renamed from: y */
    public RelativeLayout f28157y;

    /* JADX INFO: renamed from: z */
    public TextView f28158z;

    /* JADX INFO: renamed from: com.cgfay.camera.activity.CameraSettingActivity$a */
    public class ViewOnClickListenerC5779a implements View.OnClickListener {
        public ViewOnClickListenerC5779a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.layout_select_watermark) {
                CameraSettingActivity cameraSettingActivity = CameraSettingActivity.this;
                int i = CameraSettingActivity.f28152u;
                Objects.requireNonNull(cameraSettingActivity);
                cameraSettingActivity.startActivity(new Intent(cameraSettingActivity, (Class<?>) WatermarkActivity.class));
                return;
            }
            if (id == R.id.layout_show_face_points) {
                CameraParam cameraParam = CameraParam.f3841a;
                cameraParam.f3842b = !cameraParam.f3842b;
                CameraSettingActivity cameraSettingActivity2 = CameraSettingActivity.this;
                int i2 = CameraSettingActivity.f28152u;
                cameraSettingActivity2.m12565O();
                return;
            }
            if (id == R.id.layout_show_fps) {
                CameraParam cameraParam2 = CameraParam.f3841a;
                cameraParam2.f3843c = !cameraParam2.f3843c;
                CameraSettingActivity cameraSettingActivity3 = CameraSettingActivity.this;
                int i3 = CameraSettingActivity.f28152u;
                cameraSettingActivity3.m12566P();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m12565O() {
        this.f28156x.setText(getString(CameraParam.f3841a.f3842b ? R.string.show_face_points : R.string.hide_face_points));
    }

    /* JADX INFO: renamed from: P */
    public final void m12566P() {
        this.f28158z.setText(getString(CameraParam.f3841a.f3843c ? R.string.show_fps : R.string.hide_fps));
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_camera_setting);
        this.f28154v = (RelativeLayout) findViewById(R.id.layout_select_watermark);
        this.f28155w = (RelativeLayout) findViewById(R.id.layout_show_face_points);
        this.f28156x = (TextView) findViewById(R.id.tv_show_face_points);
        m12565O();
        this.f28157y = (RelativeLayout) findViewById(R.id.layout_show_fps);
        this.f28158z = (TextView) findViewById(R.id.tv_show_fps);
        m12566P();
        this.f28154v.setOnClickListener(this.f28153A);
        this.f28155w.setOnClickListener(this.f28153A);
        this.f28157y.setOnClickListener(this.f28153A);
    }
}

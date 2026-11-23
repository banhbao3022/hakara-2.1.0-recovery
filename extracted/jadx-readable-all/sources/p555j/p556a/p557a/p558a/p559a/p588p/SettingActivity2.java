package p555j.p556a.p557a.p558a.p559a.p588p;

import android.content.Intent;
import android.content.SharedPreferences;
import mtp.media.karaoke.MainActivity;
import mtp.media.karaoke.p628ui.screen.setting.SettingActivity;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;

/* JADX INFO: renamed from: j.a.a.a.a.p.a, reason: use source file name */
/* JADX INFO: compiled from: SettingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SettingActivity2 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SettingActivity.C7346d f31777g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingActivity2(SettingActivity.C7346d c7346d) {
        super(0);
        this.f31777g = c7346d;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        Intrinsics2.m13089e("current_user", "key");
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        sharedPreferences.edit().remove("current_user").apply();
        Intrinsics2.m13089e("access_token", "key");
        SharedPreferences sharedPreferences2 = ModelPrefs.f32358a;
        if (sharedPreferences2 == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        sharedPreferences2.edit().remove("access_token").apply();
        Intent intentM14330a = MainActivity.f33373w.m14330a(SettingActivity.this, null);
        intentM14330a.setFlags(67108864);
        SettingActivity.this.startActivity(intentM14330a);
        SettingActivity.this.finish();
        return Unit.f29502a;
    }
}

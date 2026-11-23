package p555j.p556a.p557a.p558a.p559a.p590r;

import android.content.SharedPreferences;
import java.io.File;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.addon.seekbar.CustomSeekBar;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p071d.p078c.p079a.outline;
import p007c.p080e.p081a.ExecuteCallback;
import p007c.p190n.p430e.GsonBuilder;
import p007c.p451o.p452a.C5729a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Ref;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p636z0.p752p.C8310a;

/* JADX INFO: renamed from: j.a.a.a.a.r.d0 */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6791d0 implements ExecuteCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingActivity f31831a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f31832b;

    public C6791d0(SingActivity singActivity, File file) {
        this.f31831a = singActivity;
        this.f31832b = file;
    }

    @Override // p007c.p080e.p081a.ExecuteCallback
    /* JADX INFO: renamed from: a */
    public final void mo1605a(long j2, int i) {
        if (i != 0) {
            return;
        }
        this.f31832b.delete();
        SingActivity singActivity = this.f31831a;
        SingActivity.C7351e c7351e = SingActivity.f33896w;
        Song songM421d = singActivity.mo13969R().f31857l.m421d();
        if (songM421d != null) {
            String string = singActivity.f33931i0.size() > 0 ? new GsonBuilder().m12322a().m12319f(singActivity.f33931i0).toString() : null;
            Ref ref = new Ref();
            CustomSeekBar customSeekBar = (CustomSeekBar) singActivity.m14442U(R.id.songSeekBar);
            Intrinsics2.m13088d(customSeekBar, "songSeekBar");
            ref.f29602f = customSeekBar.getProgress();
            CustomSeekBar customSeekBar2 = (CustomSeekBar) singActivity.m14442U(R.id.songSeekBar);
            Intrinsics2.m13088d(customSeekBar2, "songSeekBar");
            if (customSeekBar2.getProgress() <= 0) {
                ref.f29602f = (int) singActivity.f33919W;
            }
            Ref ref2 = new Ref();
            ref2.f29602f = 0;
            if (singActivity.f33935m0) {
                ref2.f29602f = 1;
            }
            Ref ref3 = new Ref();
            ref3.f29602f = 0;
            if (singActivity.f33935m0) {
                ref3.f29602f = singActivity.f33897A == 2 ? 2 : 1;
            }
            String strValueOf = String.valueOf(songM421d.getName());
            SharedPreferences sharedPreferences = ModelPrefs.f32358a;
            if (sharedPreferences == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            User user = (User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class);
            int id = user != null ? user.getId() : 0;
            int id2 = songM421d.getId();
            int i2 = singActivity.f33899C;
            String strValueOf2 = String.valueOf(songM421d.getThumbnail());
            int i3 = singActivity.f33897A;
            Boolean boolValueOf = Boolean.valueOf(singActivity.f33902F);
            String str = singActivity.f33913Q;
            String str2 = singActivity.f33914R;
            Integer numValueOf = Integer.valueOf(ref.f29602f);
            Integer numValueOf2 = Integer.valueOf(singActivity.f33908L);
            int i4 = singActivity.f33926d0;
            int i5 = ref2.f29602f;
            int i6 = ref3.f29602f;
            Date date = new Date();
            Locale locale = Locale.getDefault();
            Intrinsics2.m13088d(locale, "Locale.getDefault()");
            String strValueOf3 = String.valueOf(SkuDao.a.m14090h0(date, "yyyy-MM-dd HH:mm:ss", locale));
            Date date2 = new Date();
            Locale locale2 = Locale.getDefault();
            Intrinsics2.m13088d(locale2, "Locale.getDefault()");
            RecordingEntity recordingEntity = new RecordingEntity(null, strValueOf, id, id2, i2, null, strValueOf2, null, i3, null, null, numValueOf, numValueOf2, i4, 0, null, boolValueOf, str, str2, string, i5, i6, strValueOf3, String.valueOf(SkuDao.a.m14090h0(date2, "yyyy-MM-dd HH:mm:ss", locale2)), 50849, null);
            singActivity.m14450j0();
            C6799h0 c6799h0Mo13969R = singActivity.mo13969R();
            Objects.requireNonNull(c6799h0Mo13969R);
            Intrinsics2.m13089e(recordingEntity, "recordingEntity");
            C5729a.m12428A(C8310a.m16440e(c6799h0Mo13969R), null, 0, new C6795f0(c6799h0Mo13969R, recordingEntity, null), 3, null);
            singActivity.mo13969R().f31870y.mo422e(singActivity, new C6813p(ref, ref2, ref3, singActivity));
        }
    }
}

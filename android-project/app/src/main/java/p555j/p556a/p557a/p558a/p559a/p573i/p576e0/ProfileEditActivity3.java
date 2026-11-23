package p555j.p556a.p557a.p558a.p559a.p573i.p576e0;

import android.content.DialogInterface;
import android.widget.TextView;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.profile.edit.ProfileEditActivity;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.i.e0.b, reason: use source file name */
/* JADX INFO: compiled from: ProfileEditActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfileEditActivity3 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ProfileEditActivity.C7328e f31443f;

    public ProfileEditActivity3(ProfileEditActivity.C7328e c7328e) {
        this.f31443f = c7328e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            ProfileEditActivity profileEditActivity = ProfileEditActivity.this;
            profileEditActivity.f33830E = 1;
            TextView textView = (TextView) profileEditActivity.m14424U(R.id.txtGender);
            Intrinsics2.m13088d(textView, "txtGender");
            textView.setText(ProfileEditActivity.this.getString(R.string.text_gender_male));
            return;
        }
        if (i == 1) {
            ProfileEditActivity profileEditActivity2 = ProfileEditActivity.this;
            profileEditActivity2.f33830E = 2;
            TextView textView2 = (TextView) profileEditActivity2.m14424U(R.id.txtGender);
            Intrinsics2.m13088d(textView2, "txtGender");
            textView2.setText(ProfileEditActivity.this.getString(R.string.text_gender_female));
            return;
        }
        if (i != 2) {
            return;
        }
        ProfileEditActivity profileEditActivity3 = ProfileEditActivity.this;
        profileEditActivity3.f33830E = 0;
        TextView textView3 = (TextView) profileEditActivity3.m14424U(R.id.txtGender);
        Intrinsics2.m13088d(textView3, "txtGender");
        textView3.setText(ProfileEditActivity.this.getString(R.string.text_gender_secret));
    }
}

package p555j.p556a.p557a.p558a.p559a.p573i.p576e0;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Locale;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.profile.edit.ProfileEditActivity;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.i.e0.a, reason: use source file name */
/* JADX INFO: compiled from: ProfileEditActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfileEditActivity2 implements DatePickerDialog.OnDateSetListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ProfileEditActivity f31442a;

    public ProfileEditActivity2(ProfileEditActivity profileEditActivity) {
        this.f31442a = profileEditActivity;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        ProfileEditActivity.m14422V(this.f31442a).set(1, i);
        ProfileEditActivity.m14422V(this.f31442a).set(2, i2);
        ProfileEditActivity.m14422V(this.f31442a).set(5, i3);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.f31442a.f33826A, Locale.getDefault());
        TextView textView = (TextView) this.f31442a.m14424U(R.id.txtBirthday);
        Intrinsics2.m13088d(textView, "txtBirthday");
        textView.setText(simpleDateFormat.format(ProfileEditActivity.m14422V(this.f31442a).getTime()));
        this.f31442a.f33829D = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(ProfileEditActivity.m14422V(this.f31442a).getTime());
    }
}

package p555j.p556a.p557a.p558a.p559a.p582l;

import android.widget.TextView;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.image.ImageActivity;
import p007c.p071d.p078c.p079a.outline;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: j.a.a.a.a.l.b, reason: use source file name */
/* JADX INFO: compiled from: ImageActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ImageActivity3 extends Lambda implements InterfaceC6164l<Integer, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ImageActivity.C7283e f31605g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageActivity3(ImageActivity.C7283e c7283e) {
        super(1);
        this.f31605g = c7283e;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(Integer num) {
        int iIntValue = num.intValue();
        ImageActivity imageActivity = ImageActivity.this;
        ImageActivity.C7282d c7282d = ImageActivity.f33613y;
        TextView textView = (TextView) imageActivity.mo13978U(R.id.toolbarTitle);
        Intrinsics2.m13088d(textView, "toolbarTitle");
        String string = imageActivity.getString(R.string.txt_choose_image);
        Intrinsics2.m13088d(string, "getString(R.string.txt_choose_image)");
        outline.m1574Y(new Object[]{String.valueOf(iIntValue)}, 1, string, "java.lang.String.format(format, *args)", textView);
        return Unit.f29502a;
    }
}

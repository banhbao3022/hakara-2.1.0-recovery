package p000;

import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.IOException;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.image.ImageActivity;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p725k.p726c.ActivityCompat;
import p636z0.p725k.p727d.ContextCompat;

/* JADX INFO: renamed from: k0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes2.dex */
public final class C7157k0 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f33108g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f33109h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f33110i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7157k0(int i, Object obj, Object obj2) {
        super(0);
        this.f33108g = i;
        this.f33109h = obj;
        this.f33110i = obj2;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        int i = this.f33108g;
        boolean z = false;
        if (i == 0) {
            ImageActivity imageActivity = (ImageActivity) this.f33109h;
            imageActivity.f33616C = 4;
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            if (intent.resolveActivity(imageActivity.getPackageManager()) != null) {
                try {
                    Uri uriMo342b = FileProvider.m339a(imageActivity, "mtp.media.karaoke.fileprovider").mo342b(imageActivity.m14367Y(imageActivity));
                    imageActivity.f33620G = uriMo342b;
                    Intrinsics2.m13089e(String.valueOf(uriMo342b), "message");
                    intent.putExtra("output", imageActivity.f33620G);
                    imageActivity.startActivityForResult(intent, 4);
                } catch (IOException unused) {
                    SkuDao.a.m14092i0(imageActivity, R.string.error_media_upload_sending, 0, 2);
                }
            }
            ((BottomSheetDialog) this.f33110i).dismiss();
            return Unit.f29502a;
        }
        if (i != 1) {
            throw null;
        }
        ImageActivity imageActivity2 = (ImageActivity) this.f33109h;
        ImageActivity.C7282d c7282d = ImageActivity.f33613y;
        Objects.requireNonNull(imageActivity2);
        Intrinsics2.m13089e("img 1", "message");
        if (imageActivity2.f33616C == 1) {
            imageActivity2.f33616C = 4;
            String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
            int i2 = 0;
            while (true) {
                if (i2 >= 2) {
                    z = true;
                    break;
                }
                if (ContextCompat.m16133a(imageActivity2, strArr[i2]) != 0) {
                    ActivityCompat.m16082c(imageActivity2, strArr, 1);
                    break;
                }
                i2++;
            }
            if (z) {
                imageActivity2.m14370b0();
            }
        }
        ((BottomSheetDialog) this.f33110i).dismiss();
        return Unit.f29502a;
    }
}

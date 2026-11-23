package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.User;
import p007c.p154j.p161l.DownloadRequest;
import p007c.p154j.p161l.DownloadRequestBuilder;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p573i.C6693k;
import p555j.p556a.p557a.p558a.p559a.p573i.C6694l;
import p555j.p556a.p557a.p558a.p559a.p573i.C6695m;
import p555j.p556a.p557a.p558a.p559a.p573i.C6696n;
import p555j.p556a.p557a.p558a.p559a.p589q.ShareFragment;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p619l.PathUtils;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p725k.p726c.ActivityCompat;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: x */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C7408x extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34138g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34139h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f34140i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f34141j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7408x(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.f34138g = i;
        this.f34139h = obj;
        this.f34140i = obj2;
        this.f34141j = obj3;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        boolean z;
        int i = this.f34138g;
        if (i == 0) {
            ((BottomSheetDialog) this.f34140i).dismiss();
            ShareFragment.b bVar = ShareFragment.f31783t0;
            int id = ((Recording) this.f34141j).getId();
            String name = ((Recording) this.f34141j).getName();
            User user = ((Recording) this.f34141j).getUser();
            ShareFragment shareFragmentM13947a = bVar.m13947a(id, name, String.valueOf(user != null ? user.getFullName() : null), ((Recording) this.f34141j).getShareUrl());
            FragmentActivity fragmentActivityM16526F0 = ((C6693k) this.f34139h).m16526F0();
            Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
            shareFragmentM13947a.mo5469c1(fragmentActivityM16526F0.m16577C(), "share_popup");
            return Unit.f29502a;
        }
        if (i == 1) {
            FragmentActivity fragmentActivityM16562f = ((C6693k) this.f34139h).m16562f();
            Object systemService = fragmentActivityM16562f != null ? fragmentActivityM16562f.getSystemService("clipboard") : null;
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, ((Recording) this.f34140i).getShareUrl() + "&share_type=copylink"));
            SkuDao.a.m14092i0(((C6693k) this.f34139h).m16562f(), R.string.msg_copy_link, 0, 2);
            ((BottomSheetDialog) this.f34141j).dismiss();
            return Unit.f29502a;
        }
        if (i != 2) {
            throw null;
        }
        C6693k c6693k = (C6693k) this.f34139h;
        Objects.requireNonNull(c6693k);
        String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
        int i2 = 0;
        while (true) {
            if (i2 >= 1) {
                z = true;
                break;
            }
            if (ContextCompat.m16133a(c6693k.m16526F0(), strArr[i2]) != 0) {
                ActivityCompat.m16082c(c6693k.m16526F0(), strArr, 0);
                z = false;
                break;
            }
            i2++;
        }
        if (z) {
            C6693k c6693k2 = (C6693k) this.f34139h;
            String url = ((Recording) this.f34140i).getUrl();
            String strValueOf = String.valueOf(((Recording) this.f34140i).getId());
            String name2 = ((Recording) this.f34140i).getName();
            int format = ((Recording) this.f34140i).getFormat();
            Objects.requireNonNull(c6693k2);
            String str = strValueOf + C7804v0.m15335x(3);
            if (format == 1) {
                str = strValueOf + C7804v0.m15335x(6);
            }
            DownloadRequest downloadRequest = new DownloadRequest(new DownloadRequestBuilder(url, PathUtils.m14261g(c6693k2.m16528G0()), str));
            downloadRequest.f4470n = C6694l.f31473a;
            downloadRequest.f4468l = C6695m.f31474a;
            downloadRequest.m2244d(new C6696n(c6693k2, format, strValueOf, name2));
            ((BottomSheetDialog) this.f34141j).dismiss();
            FragmentActivity fragmentActivityM16562f2 = ((C6693k) this.f34139h).m16562f();
            if (fragmentActivityM16562f2 != null) {
                SkuDao.a.m14092i0(fragmentActivityM16562f2, R.string.txt_downloading_recording, 0, 2);
            }
        }
        return Unit.f29502a;
    }
}

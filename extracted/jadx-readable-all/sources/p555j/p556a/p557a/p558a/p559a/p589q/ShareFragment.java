package p555j.p556a.p557a.p558a.p559a.p589q;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Simple;
import mtp.media.karaoke.data.model.User;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.CallbackManager;
import p007c.p165l.p178k0.CallbackManagerImpl;
import p007c.p165l.p183m0.p185c.ShareHashtag;
import p007c.p165l.p183m0.p185c.ShareLinkContent;
import p007c.p165l.p183m0.p186d.MessageDialog;
import p007c.p165l.p183m0.p186d.ShareDialog;
import p007c.p451o.p452a.C5729a;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p592b.BaseBottomSheetDialogFragment3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p616i.ShareFragmentBinding;
import p555j.p556a.p557a.p619l.DeviceUtils;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: j.a.a.a.a.q.c, reason: use source file name */
/* JADX INFO: compiled from: ShareFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ShareFragment extends BaseBottomSheetDialogFragment3<ShareFragmentBinding, ShareViewModel3> {

    /* JADX INFO: renamed from: t0 */
    public static final b f31783t0 = new b(null);

    /* JADX INFO: renamed from: A0 */
    public String f31784A0;

    /* JADX INFO: renamed from: B0 */
    public CallbackManager f31785B0;

    /* JADX INFO: renamed from: C0 */
    public ShareDialog f31786C0;

    /* JADX INFO: renamed from: D0 */
    public CallbackManager f31787D0;

    /* JADX INFO: renamed from: E0 */
    public MessageDialog f31788E0;

    /* JADX INFO: renamed from: F0 */
    public HashMap f31789F0;

    /* JADX INFO: renamed from: x0 */
    public int f31793x0;

    /* JADX INFO: renamed from: u0 */
    public final int f31790u0 = R.layout.share_fragment;

    /* JADX INFO: renamed from: v0 */
    public final Lazy3 f31791v0 = LazyJVM.m13020a(Lazy4.NONE, new a(this, null, null));

    /* JADX INFO: renamed from: w0 */
    public final ShareAdapter f31792w0 = new ShareAdapter(new c());

    /* JADX INFO: renamed from: y0 */
    public String f31794y0 = "";

    /* JADX INFO: renamed from: z0 */
    public String f31795z0 = "";

    /* JADX INFO: renamed from: j.a.a.a.a.q.c$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class a extends Lambda implements InterfaceC6153a<ShareViewModel3> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f31796g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f31797h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f31798i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f31796g = viewModelStoreOwner;
            this.f31797h = qualifier;
            this.f31798i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.q.i] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ShareViewModel3 mo2c() {
            return SkuDao.a.m14107t(this.f31796g, Reflection.m13097a(ShareViewModel3.class), this.f31797h, this.f31798i);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.q.c$b */
    /* JADX INFO: compiled from: ShareFragment.kt */
    public static final class b {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public final ShareFragment m13947a(int i, String str, String str2, String str3) {
            Intrinsics2.m13089e(str, "recordingName");
            Intrinsics2.m13089e(str2, "recordingUSer");
            Intrinsics2.m13089e(str3, "shareUrl");
            ShareFragment shareFragment = new ShareFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("recording_id", i);
            bundle.putString("recording_name", str);
            bundle.putString("recording_user", str2);
            bundle.putString("share_url", str3);
            shareFragment.m16540M0(bundle);
            return shareFragment;
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.q.c$c */
    /* JADX INFO: compiled from: ShareFragment.kt */
    public static final class c extends Lambda implements InterfaceC6164l<Simple, Unit> {
        public c() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Simple simple) {
            Simple simple2 = simple;
            Intrinsics2.m13089e(simple2, "it");
            ShareFragment shareFragment = ShareFragment.this;
            StringBuilder sb = new StringBuilder();
            sb.append(shareFragment.f31784A0);
            sb.append("?app=hakara&from_user_id=");
            SharedPreferences sharedPreferences = ModelPrefs.f32358a;
            if (sharedPreferences == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            User user = (User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class);
            sb.append(String.valueOf(user != null ? user.getUid() : null));
            sb.append("&lang=");
            DeviceUtils.a aVar = DeviceUtils.f33080a;
            sb.append(aVar.m14248b());
            sb.append("&region=");
            sb.append(aVar.m14249c());
            String string = sb.toString();
            switch (simple2.getId()) {
                case 1:
                    ShareLinkContent.b bVar = new ShareLinkContent.b();
                    bVar.f5261a = Uri.parse(string + "&share_type=facebook");
                    ShareHashtag.b bVar2 = new ShareHashtag.b();
                    bVar2.f5268a = "#hakara";
                    bVar.f5266f = new ShareHashtag(bVar2, null);
                    ShareLinkContent shareLinkContent = new ShareLinkContent(bVar, null);
                    ShareDialog shareDialog = shareFragment.f31786C0;
                    if (shareDialog != null) {
                        shareDialog.m2500f(shareLinkContent);
                    }
                    break;
                case 2:
                    ShareLinkContent.b bVar3 = new ShareLinkContent.b();
                    bVar3.f5261a = Uri.parse(string + "&share_type=messenger");
                    ShareLinkContent shareLinkContent2 = new ShareLinkContent(bVar3, null);
                    MessageDialog messageDialog = shareFragment.f31788E0;
                    if (messageDialog != null) {
                        messageDialog.m2500f(shareLinkContent2);
                    }
                    break;
                case 3:
                    StringBuilder sb2 = new StringBuilder();
                    String strM16546Q = shareFragment.m16546Q(R.string.msg_share_body);
                    Intrinsics2.m13088d(strM16546Q, "getString(R.string.msg_share_body)");
                    String str = String.format(strM16546Q, Arrays.copyOf(new Object[]{shareFragment.f31794y0}, 1));
                    Intrinsics2.m13088d(str, "java.lang.String.format(format, *args)");
                    sb2.append(str);
                    sb2.append(" ");
                    sb2.append(string);
                    sb2.append("&share_type=message");
                    String string2 = sb2.toString();
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("smsto:"));
                    intent.setType("vnd.android-dir/mms-sms");
                    intent.putExtra("sms_body", string2);
                    shareFragment.m16555U0(intent);
                    break;
                case 4:
                    StringBuilder sb3 = new StringBuilder();
                    String strM16546Q2 = shareFragment.m16546Q(R.string.msg_share_body);
                    Intrinsics2.m13088d(strM16546Q2, "getString(R.string.msg_share_body)");
                    String str2 = String.format(strM16546Q2, Arrays.copyOf(new Object[]{shareFragment.f31794y0}, 1));
                    Intrinsics2.m13088d(str2, "java.lang.String.format(format, *args)");
                    sb3.append(str2);
                    sb3.append(" ");
                    sb3.append(Uri.parse(string + "&share_type=email"));
                    String string3 = sb3.toString();
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("mailto:"));
                    intent2.putExtra("android.intent.extra.SUBJECT", shareFragment.m16539M().getString(R.string.msg_share_subject, shareFragment.f31795z0));
                    intent2.putExtra("android.intent.extra.TEXT", string3);
                    shareFragment.m16555U0(intent2);
                    break;
                case 5:
                    FragmentActivity fragmentActivityM16562f = shareFragment.m16562f();
                    Object systemService = fragmentActivityM16562f != null ? fragmentActivityM16562f.getSystemService("clipboard") : null;
                    Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, string + "&share_type=copylink"));
                    SkuDao.a.m14092i0(shareFragment.m16562f(), R.string.msg_copy_link, 0, 2);
                    shareFragment.mo11126W0();
                    break;
                case 6:
                    StringBuilder sb4 = new StringBuilder();
                    String strM16546Q3 = shareFragment.m16546Q(R.string.msg_share_body);
                    Intrinsics2.m13088d(strM16546Q3, "getString(R.string.msg_share_body)");
                    String str3 = String.format(strM16546Q3, Arrays.copyOf(new Object[]{shareFragment.f31794y0}, 1));
                    Intrinsics2.m13088d(str3, "java.lang.String.format(format, *args)");
                    sb4.append(str3);
                    sb4.append(" ");
                    sb4.append(Uri.parse(string + "&share_type=more"));
                    String string4 = sb4.toString();
                    Intent intent3 = new Intent();
                    intent3.setAction("android.intent.action.SEND");
                    intent3.putExtra("android.intent.extra.SUBJECT", shareFragment.m16539M().getString(R.string.msg_share_subject, shareFragment.f31795z0));
                    intent3.putExtra("android.intent.extra.TEXT", string4);
                    intent3.setType("text/plain");
                    shareFragment.m16555U0(Intent.createChooser(intent3, shareFragment.m16539M().getText(R.string.send_recording_link_to)));
                    break;
            }
            return Unit.f29502a;
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: X */
    public void mo2588X(int i, int i2, Intent intent) {
        super.mo2588X(i, i2, intent);
        CallbackManager callbackManager = this.f31785B0;
        if (callbackManager != null) {
            ((CallbackManagerImpl) callbackManager).m2426a(i, i2, intent);
        }
        CallbackManager callbackManager2 = this.f31787D0;
        if (callbackManager2 != null) {
            ((CallbackManagerImpl) callbackManager2).m2426a(i, i2, intent);
        }
    }

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        Bundle bundle2 = this.f38438m;
        if (bundle2 != null) {
            this.f31793x0 = bundle2.getInt("recording_id");
            this.f31794y0 = String.valueOf(bundle2.getString("recording_name"));
            this.f31795z0 = String.valueOf(bundle2.getString("recording_user"));
            this.f31784A0 = bundle2.getString("share_url");
        }
        this.f31785B0 = new CallbackManagerImpl();
        ShareDialog shareDialog = new ShareDialog(this);
        this.f31786C0 = shareDialog;
        shareDialog.m2498d(this.f31785B0, new ShareFragment2(this), 90);
        this.f31787D0 = new CallbackManagerImpl();
        MessageDialog messageDialog = new MessageDialog(this);
        this.f31788E0 = messageDialog;
        messageDialog.m2498d(this.f31787D0, new ShareFragment3(this), 91);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseBottomSheetDialogFragment3
    /* JADX INFO: renamed from: d1 */
    public void mo13924d1() {
        HashMap map = this.f31789F0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseBottomSheetDialogFragment3
    /* JADX INFO: renamed from: f1 */
    public int mo13925f1() {
        return this.f31790u0;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseBottomSheetDialogFragment3, p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo467h0() {
        super.mo467h0();
        HashMap map = this.f31789F0;
        if (map != null) {
            map.clear();
        }
    }

    /* JADX INFO: renamed from: i1 */
    public View m13945i1(int i) {
        if (this.f31789F0 == null) {
            this.f31789F0 = new HashMap();
        }
        View view = (View) this.f31789F0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f31789F0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseBottomSheetDialogFragment3
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public ShareViewModel3 mo13926g1() {
        return (ShareViewModel3) this.f31791v0.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseBottomSheetDialogFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: w0 */
    public void mo471w0(View view, Bundle bundle) {
        Intrinsics2.m13089e(view, "view");
        super.mo471w0(view, bundle);
        ShareViewModel3 shareViewModel3Mo13926g1 = mo13926g1();
        Objects.requireNonNull(shareViewModel3Mo13926g1);
        C5729a.m12428A(C8310a.m16440e(shareViewModel3Mo13926g1), null, 0, new ShareViewModel(shareViewModel3Mo13926g1, null), 3, null);
        ((RecyclerView) m13945i1(R.id.recyclerViewShare)).setHasFixedSize(true);
        RecyclerView recyclerView = (RecyclerView) m13945i1(R.id.recyclerViewShare);
        Intrinsics2.m13088d(recyclerView, "recyclerViewShare");
        recyclerView.setAdapter(this.f31792w0);
        RecyclerView recyclerView2 = (RecyclerView) m13945i1(R.id.recyclerViewShare);
        Intrinsics2.m13088d(recyclerView2, "recyclerViewShare");
        recyclerView2.setLayoutManager(new GridLayoutManager(m16528G0(), 2, 0, false));
        mo13926g1().f31813l.mo422e(m16548R(), new ShareFragment4(this));
    }
}

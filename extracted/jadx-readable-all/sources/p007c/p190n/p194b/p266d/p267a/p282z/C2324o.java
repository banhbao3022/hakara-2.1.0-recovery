package p007c.p190n.p194b.p266d.p267a.p282z;

import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C3331nn;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3122i;
import p007c.p190n.p194b.p266d.p314j.p315a.gx2;
import p007c.p190n.p194b.p266d.p314j.p315a.sd2;

/* JADX INFO: renamed from: c.n.b.d.a.z.o */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2324o extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BinderC2329t f10866a;

    public C2324o(BinderC2329t binderC2329t) {
        this.f10866a = binderC2329t;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        InterfaceC3122i interfaceC3122i = this.f10866a.f10881l;
        if (interfaceC3122i != null) {
            try {
                interfaceC3122i.mo5870D0(C2622l.m5285M2(1, null, null));
            } catch (RemoteException e) {
                C2622l.m5271J3("#007 Could not call remote method.", e);
            }
        }
        InterfaceC3122i interfaceC3122i2 = this.f10866a.f10881l;
        if (interfaceC3122i2 != null) {
            try {
                interfaceC3122i2.mo5871L(0);
            } catch (RemoteException e2) {
                C2622l.m5271J3("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int iM7893k = 0;
        if (str.startsWith(this.f10866a.m4871G6())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            InterfaceC3122i interfaceC3122i = this.f10866a.f10881l;
            if (interfaceC3122i != null) {
                try {
                    interfaceC3122i.mo5870D0(C2622l.m5285M2(3, null, null));
                } catch (RemoteException e) {
                    C2622l.m5271J3("#007 Could not call remote method.", e);
                }
            }
            InterfaceC3122i interfaceC3122i2 = this.f10866a.f10881l;
            if (interfaceC3122i2 != null) {
                try {
                    interfaceC3122i2.mo5871L(3);
                } catch (RemoteException e2) {
                    C2622l.m5271J3("#007 Could not call remote method.", e2);
                }
            }
            this.f10866a.m4870F6(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            InterfaceC3122i interfaceC3122i3 = this.f10866a.f10881l;
            if (interfaceC3122i3 != null) {
                try {
                    interfaceC3122i3.mo5870D0(C2622l.m5285M2(1, null, null));
                } catch (RemoteException e3) {
                    C2622l.m5271J3("#007 Could not call remote method.", e3);
                }
            }
            InterfaceC3122i interfaceC3122i4 = this.f10866a.f10881l;
            if (interfaceC3122i4 != null) {
                try {
                    interfaceC3122i4.mo5871L(0);
                } catch (RemoteException e4) {
                    C2622l.m5271J3("#007 Could not call remote method.", e4);
                }
            }
            this.f10866a.m4870F6(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            InterfaceC3122i interfaceC3122i5 = this.f10866a.f10881l;
            if (interfaceC3122i5 != null) {
                try {
                    interfaceC3122i5.mo5874d();
                } catch (RemoteException e5) {
                    C2622l.m5271J3("#007 Could not call remote method.", e5);
                }
            }
            BinderC2329t binderC2329t = this.f10866a;
            Objects.requireNonNull(binderC2329t);
            String queryParameter = Uri.parse(str).getQueryParameter("height");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    C3331nn c3331nn = gx2.f14692a.f14693b;
                    iM7893k = C3331nn.m7893k(binderC2329t.f10878i, Integer.parseInt(queryParameter));
                } catch (NumberFormatException unused) {
                }
            }
            this.f10866a.m4870F6(iM7893k);
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        InterfaceC3122i interfaceC3122i6 = this.f10866a.f10881l;
        if (interfaceC3122i6 != null) {
            try {
                interfaceC3122i6.mo5873c();
            } catch (RemoteException e6) {
                C2622l.m5271J3("#007 Could not call remote method.", e6);
            }
        }
        BinderC2329t binderC2329t2 = this.f10866a;
        if (binderC2329t2.f10882m != null) {
            Uri uriM8272b = Uri.parse(str);
            try {
                uriM8272b = binderC2329t2.f10882m.m8272b(uriM8272b, binderC2329t2.f10878i, null, null);
            } catch (sd2 e7) {
                C2622l.m5241D3("Unable to process ad data", e7);
            }
            str = uriM8272b.toString();
        }
        BinderC2329t binderC2329t3 = this.f10866a;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        binderC2329t3.f10878i.startActivity(intent);
        return true;
    }
}

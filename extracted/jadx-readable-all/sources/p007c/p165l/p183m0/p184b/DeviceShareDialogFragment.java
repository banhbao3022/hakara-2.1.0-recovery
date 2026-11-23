package p007c.p165l.p183m0.p184b;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.HashSet;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import mtp.media.karaoke.R;
import p007c.p165l.FacebookRequestError;
import p007c.p165l.FacebookSdk;
import p007c.p165l.GraphRequest2;
import p007c.p165l.HttpMethod;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p176j0.p177a.DeviceRequestsHelper2;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;
import p007c.p165l.p183m0.p185c.ShareContent;
import p007c.p165l.p183m0.p185c.ShareLinkContent;
import p007c.p165l.p183m0.p185c.ShareOpenGraphContent;
import p636z0.p752p.p753c.BackStackRecord;
import p636z0.p752p.p753c.DialogFragment;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: c.l.m0.b.c, reason: use source file name */
/* JADX INFO: compiled from: DeviceShareDialogFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class DeviceShareDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: s0 */
    public static ScheduledThreadPoolExecutor f5189s0;

    /* JADX INFO: renamed from: t0 */
    public ProgressBar f5190t0;

    /* JADX INFO: renamed from: u0 */
    public TextView f5191u0;

    /* JADX INFO: renamed from: v0 */
    public Dialog f5192v0;

    /* JADX INFO: renamed from: w0 */
    public volatile c f5193w0;

    /* JADX INFO: renamed from: x0 */
    public volatile ScheduledFuture f5194x0;

    /* JADX INFO: renamed from: y0 */
    public ShareContent f5195y0;

    /* JADX INFO: renamed from: c.l.m0.b.c$a */
    /* JADX INFO: compiled from: DeviceShareDialogFragment.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeviceShareDialogFragment.this.f5192v0.dismiss();
        }
    }

    /* JADX INFO: renamed from: c.l.m0.b.c$b */
    /* JADX INFO: compiled from: DeviceShareDialogFragment.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DeviceShareDialogFragment.this.f5192v0.dismiss();
        }
    }

    /* JADX INFO: renamed from: c.l.m0.b.c$c */
    /* JADX INFO: compiled from: DeviceShareDialogFragment.java */
    public static class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public String f5198f;

        /* JADX INFO: renamed from: g */
        public long f5199g;

        /* JADX INFO: renamed from: c.l.m0.b.c$c$a */
        /* JADX INFO: compiled from: DeviceShareDialogFragment.java */
        public static class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        public c() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5198f);
            parcel.writeLong(this.f5199g);
        }

        public c(Parcel parcel) {
            this.f5198f = parcel.readString();
            this.f5199g = parcel.readLong();
        }
    }

    @Override // p636z0.p752p.p753c.DialogFragment
    /* JADX INFO: renamed from: Z0 */
    public Dialog mo2217Z0(Bundle bundle) {
        this.f5192v0 = new Dialog(m16562f(), R.style.com_facebook_auth_dialog);
        Bundle bundleM2646a = null;
        View viewInflate = m16562f().getLayoutInflater().inflate(R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        this.f5190t0 = (ProgressBar) viewInflate.findViewById(R.id.progress_bar);
        this.f5191u0 = (TextView) viewInflate.findViewById(R.id.confirmation_code);
        ((Button) viewInflate.findViewById(R.id.cancel_button)).setOnClickListener(new a());
        ((TextView) viewInflate.findViewById(R.id.com_facebook_device_auth_instructions)).setText(Html.fromHtml(m16546Q(R.string.com_facebook_device_auth_instructions)));
        this.f5192v0.setContentView(viewInflate);
        ShareContent shareContent = this.f5195y0;
        if (shareContent != null) {
            if (shareContent instanceof ShareLinkContent) {
                ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
                bundleM2646a = WebDialogParameters2.m2647b(shareLinkContent);
                Utility.m2435H(bundleM2646a, "href", shareLinkContent.f5255f);
                Utility.m2434G(bundleM2646a, "quote", shareLinkContent.f5272o);
            } else if (shareContent instanceof ShareOpenGraphContent) {
                bundleM2646a = WebDialogParameters2.m2646a((ShareOpenGraphContent) shareContent);
            }
        }
        Bundle bundle2 = bundleM2646a;
        if (bundle2 == null || bundle2.size() == 0) {
            m2606e1(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Validate.m2472a());
        sb.append("|");
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        String str = FacebookSdk.f5356e;
        if (str == null) {
            throw new IllegalStateException("No Client Token found, please set the Client Token.");
        }
        sb.append(str);
        bundle2.putString("access_token", sb.toString());
        bundle2.putString("device_info", DeviceRequestsHelper2.m2412b());
        new GraphRequest2(null, "device/share", bundle2, HttpMethod.POST, new DeviceShareDialogFragment2(this)).m2688e();
        return this.f5192v0;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m2605d1(int i, Intent intent) {
        if (this.f5193w0 != null) {
            DeviceRequestsHelper2.m2411a(this.f5193w0.f5198f);
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra("error");
        if (facebookRequestError != null) {
            Toast.makeText(m16571x(), facebookRequestError.m2602a(), 0).show();
        }
        if (m16550S()) {
            FragmentActivity fragmentActivityM16562f = m16562f();
            fragmentActivityM16562f.setResult(i, intent);
            fragmentActivityM16562f.finish();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final void m2606e1(FacebookRequestError facebookRequestError) {
        if (m16550S()) {
            BackStackRecord backStackRecord = new BackStackRecord(this.f38450y);
            backStackRecord.mo16449h(this);
            backStackRecord.mo16444c();
        }
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        m2605d1(-1, intent);
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: f0 */
    public View mo466f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c cVar;
        View viewMo466f0 = super.mo466f0(layoutInflater, viewGroup, bundle);
        if (bundle != null && (cVar = (c) bundle.getParcelable("request_state")) != null) {
            m2607f1(cVar);
        }
        return viewMo466f0;
    }

    /* JADX INFO: renamed from: f1 */
    public final void m2607f1(c cVar) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        this.f5193w0 = cVar;
        this.f5191u0.setText(cVar.f5198f);
        this.f5191u0.setVisibility(0);
        this.f5190t0.setVisibility(8);
        synchronized (DeviceShareDialogFragment.class) {
            if (f5189s0 == null) {
                f5189s0 = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f5189s0;
        }
        this.f5194x0 = scheduledThreadPoolExecutor.schedule(new b(), cVar.f5199g, TimeUnit.SECONDS);
    }

    @Override // p636z0.p752p.p753c.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f5194x0 != null) {
            this.f5194x0.cancel(true);
        }
        m2605d1(-1, new Intent());
    }

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: t0 */
    public void mo470t0(Bundle bundle) {
        super.mo470t0(bundle);
        if (this.f5193w0 != null) {
            bundle.putParcelable("request_state", this.f5193w0);
        }
    }
}

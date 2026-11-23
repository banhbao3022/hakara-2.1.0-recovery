package p007c.p165l.p182l0;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.FacebookActivity;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import mtp.media.karaoke.R;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.AccessToken;
import p007c.p165l.AccessTokenSource;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookRequestError;
import p007c.p165l.FacebookSdk;
import p007c.p165l.GraphRequest2;
import p007c.p165l.GraphRequestAsyncTask;
import p007c.p165l.GraphResponse;
import p007c.p165l.HttpMethod;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.InternalAppEventsLogger;
import p007c.p165l.p176j0.p177a.DeviceRequestsHelper;
import p007c.p165l.p176j0.p177a.DeviceRequestsHelper2;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;
import p007c.p190n.p438f.BarcodeFormat;
import p007c.p190n.p438f.EncodeHintType;
import p007c.p190n.p438f.MultiFormatWriter;
import p007c.p190n.p438f.WriterException;
import p007c.p190n.p438f.p441j.BitMatrix;
import p636z0.p752p.p753c.DialogFragment;

/* JADX INFO: renamed from: c.l.l0.c, reason: use source file name */
/* JADX INFO: compiled from: DeviceAuthDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class DeviceAuthDialog extends DialogFragment {

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ int f5076s0 = 0;

    /* JADX INFO: renamed from: A0 */
    public volatile d f5077A0;

    /* JADX INFO: renamed from: B0 */
    public Dialog f5078B0;

    /* JADX INFO: renamed from: t0 */
    public View f5082t0;

    /* JADX INFO: renamed from: u0 */
    public TextView f5083u0;

    /* JADX INFO: renamed from: v0 */
    public TextView f5084v0;

    /* JADX INFO: renamed from: w0 */
    public DeviceAuthMethodHandler f5085w0;

    /* JADX INFO: renamed from: y0 */
    public volatile GraphRequestAsyncTask f5087y0;

    /* JADX INFO: renamed from: z0 */
    public volatile ScheduledFuture f5088z0;

    /* JADX INFO: renamed from: x0 */
    public AtomicBoolean f5086x0 = new AtomicBoolean();

    /* JADX INFO: renamed from: C0 */
    public boolean f5079C0 = false;

    /* JADX INFO: renamed from: D0 */
    public boolean f5080D0 = false;

    /* JADX INFO: renamed from: E0 */
    public LoginClient.d f5081E0 = null;

    /* JADX INFO: renamed from: c.l.l0.c$a */
    /* JADX INFO: compiled from: DeviceAuthDialog.java */
    public class a implements GraphRequest2.c {
        public a() {
        }

        @Override // p007c.p165l.GraphRequest2.c
        /* JADX INFO: renamed from: b */
        public void mo2263b(GraphResponse graphResponse) {
            DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
            if (deviceAuthDialog.f5079C0) {
                return;
            }
            FacebookRequestError facebookRequestError = graphResponse.f5409d;
            if (facebookRequestError != null) {
                deviceAuthDialog.m2565h1(facebookRequestError.f5184p);
                return;
            }
            JSONObject jSONObject = graphResponse.f5408c;
            d dVar = new d();
            try {
                String string = jSONObject.getString("user_code");
                dVar.f5093g = string;
                dVar.f5092f = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", string);
                dVar.f5094h = jSONObject.getString("code");
                dVar.f5095i = jSONObject.getLong("interval");
                DeviceAuthDialog.this.m2568k1(dVar);
            } catch (JSONException e) {
                DeviceAuthDialog.this.m2565h1(new FacebookException(e));
            }
        }
    }

    /* JADX INFO: renamed from: c.l.l0.c$b */
    /* JADX INFO: compiled from: DeviceAuthDialog.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeviceAuthDialog.this.m2564g1();
        }
    }

    /* JADX INFO: renamed from: c.l.l0.c$c */
    /* JADX INFO: compiled from: DeviceAuthDialog.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
            int i = DeviceAuthDialog.f5076s0;
            deviceAuthDialog.m2566i1();
        }
    }

    /* JADX INFO: renamed from: c.l.l0.c$d */
    /* JADX INFO: compiled from: DeviceAuthDialog.java */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public String f5092f;

        /* JADX INFO: renamed from: g */
        public String f5093g;

        /* JADX INFO: renamed from: h */
        public String f5094h;

        /* JADX INFO: renamed from: i */
        public long f5095i;

        /* JADX INFO: renamed from: j */
        public long f5096j;

        /* JADX INFO: renamed from: c.l.l0.c$d$a */
        /* JADX INFO: compiled from: DeviceAuthDialog.java */
        public static class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5092f);
            parcel.writeString(this.f5093g);
            parcel.writeString(this.f5094h);
            parcel.writeLong(this.f5095i);
            parcel.writeLong(this.f5096j);
        }

        public d(Parcel parcel) {
            this.f5092f = parcel.readString();
            this.f5093g = parcel.readString();
            this.f5094h = parcel.readString();
            this.f5095i = parcel.readLong();
            this.f5096j = parcel.readLong();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public static void m2561d1(DeviceAuthDialog deviceAuthDialog, String str, Long l, Long l2) {
        Date date;
        Objects.requireNonNull(deviceAuthDialog);
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        if (l.longValue() != 0) {
            date = new Date((l.longValue() * 1000) + new Date().getTime());
        } else {
            date = null;
        }
        Date date2 = l2.longValue() != 0 ? new Date(l2.longValue() * 1000) : null;
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        new GraphRequest2(new AccessToken(str, FacebookSdk.f5354c, "0", null, null, null, null, date, null, date2), "me", bundle, HttpMethod.GET, new DeviceAuthDialog5(deviceAuthDialog, str, date, date2)).m2688e();
    }

    /* JADX INFO: renamed from: e1 */
    public static void m2562e1(DeviceAuthDialog deviceAuthDialog, String str, Utility.d dVar, String str2, Date date, Date date2) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = deviceAuthDialog.f5085w0;
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        String str3 = FacebookSdk.f5354c;
        List<String> list = dVar.f4918a;
        List<String> list2 = dVar.f4919b;
        List<String> list3 = dVar.f4920c;
        AccessTokenSource accessTokenSource = AccessTokenSource.DEVICE_AUTH;
        Objects.requireNonNull(deviceAuthMethodHandler);
        deviceAuthMethodHandler.f5163g.m2577d(LoginClient.e.m2587d(deviceAuthMethodHandler.f5163g.f5122l, new AccessToken(str2, str3, str, list, list2, list3, accessTokenSource, date, null, date2)));
        deviceAuthDialog.f5078B0.dismiss();
    }

    @Override // p636z0.p752p.p753c.DialogFragment
    /* JADX INFO: renamed from: Z0 */
    public Dialog mo2217Z0(Bundle bundle) {
        this.f5078B0 = new Dialog(m16562f(), R.style.com_facebook_auth_dialog);
        this.f5078B0.setContentView(m2563f1(DeviceRequestsHelper2.m2413c() && !this.f5080D0));
        return this.f5078B0;
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: f0 */
    public View mo466f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        d dVar;
        View viewMo466f0 = super.mo466f0(layoutInflater, viewGroup, bundle);
        this.f5085w0 = (DeviceAuthMethodHandler) ((LoginFragment) ((FacebookActivity) m16562f()).f28292u).f5148d0.m2579f();
        if (bundle != null && (dVar = (d) bundle.getParcelable("request_state")) != null) {
            m2568k1(dVar);
        }
        return viewMo466f0;
    }

    /* JADX INFO: renamed from: f1 */
    public View m2563f1(boolean z) {
        View viewInflate = m16562f().getLayoutInflater().inflate(z ? R.layout.com_facebook_smart_device_dialog_fragment : R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        this.f5082t0 = viewInflate.findViewById(R.id.progress_bar);
        this.f5083u0 = (TextView) viewInflate.findViewById(R.id.confirmation_code);
        ((Button) viewInflate.findViewById(R.id.cancel_button)).setOnClickListener(new b());
        TextView textView = (TextView) viewInflate.findViewById(R.id.com_facebook_device_auth_instructions);
        this.f5084v0 = textView;
        textView.setText(Html.fromHtml(m16546Q(R.string.com_facebook_device_auth_instructions)));
        return viewInflate;
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: g0 */
    public void mo1956g0() {
        this.f5079C0 = true;
        this.f5086x0.set(true);
        this.f38414K = true;
        if (this.f5087y0 != null) {
            this.f5087y0.cancel(true);
        }
        if (this.f5088z0 != null) {
            this.f5088z0.cancel(true);
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m2564g1() {
        if (this.f5086x0.compareAndSet(false, true)) {
            if (this.f5077A0 != null) {
                DeviceRequestsHelper2.m2411a(this.f5077A0.f5093g);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f5085w0;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.f5163g.m2577d(LoginClient.e.m2584a(deviceAuthMethodHandler.f5163g.f5122l, "User canceled log in."));
            }
            this.f5078B0.dismiss();
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m2565h1(FacebookException facebookException) {
        if (this.f5086x0.compareAndSet(false, true)) {
            if (this.f5077A0 != null) {
                DeviceRequestsHelper2.m2411a(this.f5077A0.f5093g);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f5085w0;
            deviceAuthMethodHandler.f5163g.m2577d(LoginClient.e.m2585b(deviceAuthMethodHandler.f5163g.f5122l, null, facebookException.getMessage()));
            this.f5078B0.dismiss();
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m2566i1() {
        this.f5077A0.f5096j = new Date().getTime();
        Bundle bundle = new Bundle();
        bundle.putString("code", this.f5077A0.f5094h);
        this.f5087y0 = new GraphRequest2(null, "device/login_status", bundle, HttpMethod.POST, new DeviceAuthDialog2(this)).m2688e();
    }

    /* JADX INFO: renamed from: j1 */
    public final void m2567j1() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceAuthMethodHandler.class) {
            if (DeviceAuthMethodHandler.f5109h == null) {
                DeviceAuthMethodHandler.f5109h = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = DeviceAuthMethodHandler.f5109h;
        }
        this.f5088z0 = scheduledThreadPoolExecutor.schedule(new c(), this.f5077A0.f5095i, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: k1 */
    public final void m2568k1(d dVar) {
        Bitmap bitmapCreateBitmap;
        boolean z;
        this.f5077A0 = dVar;
        this.f5083u0.setText(dVar.f5093g);
        String str = dVar.f5092f;
        HashMap<String, NsdManager.RegistrationListener> map = DeviceRequestsHelper2.f4871a;
        EnumMap enumMap = new EnumMap(EncodeHintType.class);
        enumMap.put(EncodeHintType.MARGIN, 2);
        boolean z2 = false;
        try {
            BitMatrix bitMatrixMo12331a = new MultiFormatWriter().mo12331a(str, BarcodeFormat.QR_CODE, 200, 200, enumMap);
            int i = bitMatrixMo12331a.f27644g;
            int i2 = bitMatrixMo12331a.f27643f;
            int[] iArr = new int[i * i2];
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * i2;
                for (int i5 = 0; i5 < i2; i5++) {
                    iArr[i4 + i5] = bitMatrixMo12331a.m12348a(i5, i3) ? -16777216 : -1;
                }
            }
            bitmapCreateBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            try {
                bitmapCreateBitmap.setPixels(iArr, 0, i2, 0, 0, i2, i);
            } catch (WriterException unused) {
            }
        } catch (WriterException unused2) {
            bitmapCreateBitmap = null;
        }
        this.f5084v0.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new BitmapDrawable(m16539M(), bitmapCreateBitmap), (Drawable) null, (Drawable) null);
        this.f5083u0.setVisibility(0);
        this.f5082t0.setVisibility(8);
        if (!this.f5080D0) {
            String str2 = dVar.f5093g;
            if (DeviceRequestsHelper2.m2413c()) {
                if (!DeviceRequestsHelper2.f4871a.containsKey(str2)) {
                    HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                    String str3 = String.format("%s_%s_%s", "fbsdk", String.format("%s-%s", "android", "5.15.3".replace('.', '|')), str2);
                    NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
                    nsdServiceInfo.setServiceType("_fb._tcp.");
                    nsdServiceInfo.setServiceName(str3);
                    nsdServiceInfo.setPort(80);
                    Validate.m2479h();
                    NsdManager nsdManager = (NsdManager) FacebookSdk.f5360i.getSystemService("servicediscovery");
                    DeviceRequestsHelper deviceRequestsHelper = new DeviceRequestsHelper(str3, str2);
                    DeviceRequestsHelper2.f4871a.put(str2, deviceRequestsHelper);
                    nsdManager.registerService(nsdServiceInfo, 1, deviceRequestsHelper);
                }
                z = true;
            } else {
                z = false;
            }
            if (z) {
                InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(m16571x());
                if (FacebookSdk.m2659a()) {
                    internalAppEventsLogger.f4855a.m2367f("fb_smart_login_service", null, null);
                }
            }
        }
        if (dVar.f5096j != 0 && (new Date().getTime() - dVar.f5096j) - (dVar.f5095i * 1000) < 0) {
            z2 = true;
        }
        if (z2) {
            m2567j1();
        } else {
            m2566i1();
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m2569l1(LoginClient.d dVar) {
        this.f5081E0 = dVar;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", dVar.f5127g));
        String str = dVar.f5132l;
        if (str != null) {
            bundle.putString("redirect_uri", str);
        }
        String str2 = dVar.f5134n;
        if (str2 != null) {
            bundle.putString("target_user_id", str2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Validate.m2472a());
        sb.append("|");
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        String str3 = FacebookSdk.f5356e;
        if (str3 == null) {
            throw new IllegalStateException("No Client Token found, please set the Client Token.");
        }
        sb.append(str3);
        bundle.putString("access_token", sb.toString());
        bundle.putString("device_info", DeviceRequestsHelper2.m2412b());
        new GraphRequest2(null, "device/login", bundle, HttpMethod.POST, new a()).m2688e();
    }

    @Override // p636z0.p752p.p753c.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f5079C0) {
            return;
        }
        m2564g1();
    }

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: t0 */
    public void mo470t0(Bundle bundle) {
        super.mo470t0(bundle);
        if (this.f5077A0 != null) {
            bundle.putParcelable("request_state", this.f5077A0);
        }
    }
}

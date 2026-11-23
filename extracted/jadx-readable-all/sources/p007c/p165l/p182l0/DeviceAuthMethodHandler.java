package p007c.p165l.p182l0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p007c.p165l.p178k0.Utility;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: c.l.l0.h, reason: use source file name */
/* JADX INFO: compiled from: DeviceAuthMethodHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new a();

    /* JADX INFO: renamed from: h */
    public static ScheduledThreadPoolExecutor f5109h;

    /* JADX INFO: renamed from: c.l.l0.h$a */
    /* JADX INFO: compiled from: DeviceAuthMethodHandler.java */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new DeviceAuthMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new DeviceAuthMethodHandler[i];
        }
    }

    public DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler
    /* JADX INFO: renamed from: e */
    public String mo2554e() {
        return "device_auth";
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler
    /* JADX INFO: renamed from: i */
    public boolean mo2557i(LoginClient.d dVar) {
        FragmentActivity fragmentActivityM2578e = this.f5163g.m2578e();
        if (fragmentActivityM2578e == null || fragmentActivityM2578e.isFinishing()) {
            return true;
        }
        DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
        deviceAuthDialog.mo5469c1(fragmentActivityM2578e.m16577C(), "login_with_facebook");
        deviceAuthDialog.m2569l1(dVar);
        return true;
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Utility.m2441N(parcel, this.f5162f);
    }

    public DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
    }
}

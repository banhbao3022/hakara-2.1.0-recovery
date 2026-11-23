package p629y0.p630a.p632b.p635b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: y0.a.b.b.b, reason: use source file name */
/* JADX INFO: compiled from: ResultReceiver.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final Handler f34158f;

    /* JADX INFO: renamed from: g */
    public IResultReceiver f34159g;

    /* JADX INFO: renamed from: y0.a.b.b.b$a */
    /* JADX INFO: compiled from: ResultReceiver.java */
    public class a implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* JADX INFO: renamed from: y0.a.b.b.b$b */
    /* JADX INFO: compiled from: ResultReceiver.java */
    public class b extends IResultReceiver.a {
        public b() {
        }
    }

    /* JADX INFO: renamed from: y0.a.b.b.b$c */
    /* JADX INFO: compiled from: ResultReceiver.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: f */
        public final int f34161f;

        /* JADX INFO: renamed from: g */
        public final Bundle f34162g;

        public c(int i, Bundle bundle) {
            this.f34161f = i;
            this.f34162g = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.mo9a(this.f34161f, this.f34162g);
        }
    }

    public ResultReceiver(Handler handler) {
        this.f34158f = handler;
    }

    /* JADX INFO: renamed from: a */
    public void mo9a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f34159g == null) {
                this.f34159g = new b();
            }
            parcel.writeStrongBinder(this.f34159g.asBinder());
        }
    }

    public ResultReceiver(Parcel parcel) {
        IResultReceiver c8558a = null;
        this.f34158f = null;
        IBinder strongBinder = parcel.readStrongBinder();
        int i = IResultReceiver.a.f34156f;
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IResultReceiver)) {
                c8558a = (IResultReceiver) iInterfaceQueryLocalInterface;
            } else {
                c8558a = new IResultReceiver.a.C8558a(strongBinder);
            }
        }
        this.f34159g = c8558a;
    }
}

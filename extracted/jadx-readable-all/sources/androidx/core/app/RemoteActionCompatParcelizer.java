package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;
import p636z0.p692g0.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object objM15636o = remoteActionCompat.f662a;
        if (versionedParcel.mo15630i(1)) {
            objM15636o = versionedParcel.m15636o();
        }
        remoteActionCompat.f662a = (IconCompat) objM15636o;
        CharSequence charSequenceMo15629h = remoteActionCompat.f663b;
        if (versionedParcel.mo15630i(2)) {
            charSequenceMo15629h = versionedParcel.mo15629h();
        }
        remoteActionCompat.f663b = charSequenceMo15629h;
        CharSequence charSequenceMo15629h2 = remoteActionCompat.f664c;
        if (versionedParcel.mo15630i(3)) {
            charSequenceMo15629h2 = versionedParcel.mo15629h();
        }
        remoteActionCompat.f664c = charSequenceMo15629h2;
        remoteActionCompat.f665d = (PendingIntent) versionedParcel.m15634m(remoteActionCompat.f665d, 4);
        boolean zMo15627f = remoteActionCompat.f666e;
        if (versionedParcel.mo15630i(5)) {
            zMo15627f = versionedParcel.mo15627f();
        }
        remoteActionCompat.f666e = zMo15627f;
        boolean zMo15627f2 = remoteActionCompat.f667f;
        if (versionedParcel.mo15630i(6)) {
            zMo15627f2 = versionedParcel.mo15627f();
        }
        remoteActionCompat.f667f = zMo15627f2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        IconCompat iconCompat = remoteActionCompat.f662a;
        versionedParcel.mo15637p(1);
        versionedParcel.m15644w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f663b;
        versionedParcel.mo15637p(2);
        versionedParcel.mo15640s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f664c;
        versionedParcel.mo15637p(3);
        versionedParcel.mo15640s(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f665d;
        versionedParcel.mo15637p(4);
        versionedParcel.mo15642u(pendingIntent);
        boolean z = remoteActionCompat.f666e;
        versionedParcel.mo15637p(5);
        versionedParcel.mo15638q(z);
        boolean z2 = remoteActionCompat.f667f;
        versionedParcel.mo15637p(6);
        versionedParcel.mo15638q(z2);
    }
}

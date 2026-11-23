package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;
import p636z0.p692g0.VersionedParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteActionCompat implements VersionedParcelable {

    /* JADX INFO: renamed from: a */
    public IconCompat f662a;

    /* JADX INFO: renamed from: b */
    public CharSequence f663b;

    /* JADX INFO: renamed from: c */
    public CharSequence f664c;

    /* JADX INFO: renamed from: d */
    public PendingIntent f665d;

    /* JADX INFO: renamed from: e */
    public boolean f666e;

    /* JADX INFO: renamed from: f */
    public boolean f667f;

    public RemoteActionCompat(IconCompat iconCompat, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        Objects.requireNonNull(iconCompat);
        this.f662a = iconCompat;
        Objects.requireNonNull(charSequence);
        this.f663b = charSequence;
        Objects.requireNonNull(charSequence2);
        this.f664c = charSequence2;
        Objects.requireNonNull(pendingIntent);
        this.f665d = pendingIntent;
        this.f666e = true;
        this.f667f = true;
    }

    public RemoteActionCompat() {
    }

    public RemoteActionCompat(RemoteActionCompat remoteActionCompat) {
        Objects.requireNonNull(remoteActionCompat);
        this.f662a = remoteActionCompat.f662a;
        this.f663b = remoteActionCompat.f663b;
        this.f664c = remoteActionCompat.f664c;
        this.f665d = remoteActionCompat.f665d;
        this.f666e = remoteActionCompat.f666e;
        this.f667f = remoteActionCompat.f667f;
    }
}

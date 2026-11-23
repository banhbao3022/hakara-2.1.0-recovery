package androidx.media;

import java.util.Objects;
import p636z0.p692g0.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object objM15636o = audioAttributesCompat.f800b;
        if (versionedParcel.mo15630i(1)) {
            objM15636o = versionedParcel.m15636o();
        }
        audioAttributesCompat.f800b = (AudioAttributesImpl) objM15636o;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f800b;
        versionedParcel.mo15637p(1);
        versionedParcel.m15644w(audioAttributesImpl);
    }
}

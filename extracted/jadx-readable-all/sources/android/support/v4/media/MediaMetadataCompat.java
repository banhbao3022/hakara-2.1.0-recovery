package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p691g.ArrayMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* JADX INFO: renamed from: f */
    public static final ArrayMap<String, Integer> f57f;

    /* JADX INFO: renamed from: g */
    public final Bundle f58g;

    /* JADX INFO: renamed from: h */
    public MediaMetadata f59h;

    /* JADX INFO: renamed from: android.support.v4.media.MediaMetadataCompat$a */
    public class C0022a implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        ArrayMap<String, Integer> arrayMap = new ArrayMap<>();
        f57f = arrayMap;
        arrayMap.put("android.media.metadata.TITLE", 1);
        arrayMap.put("android.media.metadata.ARTIST", 1);
        arrayMap.put("android.media.metadata.DURATION", 0);
        arrayMap.put("android.media.metadata.ALBUM", 1);
        arrayMap.put("android.media.metadata.AUTHOR", 1);
        arrayMap.put("android.media.metadata.WRITER", 1);
        arrayMap.put("android.media.metadata.COMPOSER", 1);
        arrayMap.put("android.media.metadata.COMPILATION", 1);
        arrayMap.put("android.media.metadata.DATE", 1);
        arrayMap.put("android.media.metadata.YEAR", 0);
        arrayMap.put("android.media.metadata.GENRE", 1);
        arrayMap.put("android.media.metadata.TRACK_NUMBER", 0);
        arrayMap.put("android.media.metadata.NUM_TRACKS", 0);
        arrayMap.put("android.media.metadata.DISC_NUMBER", 0);
        arrayMap.put("android.media.metadata.ALBUM_ARTIST", 1);
        arrayMap.put("android.media.metadata.ART", 2);
        arrayMap.put("android.media.metadata.ART_URI", 1);
        arrayMap.put("android.media.metadata.ALBUM_ART", 2);
        arrayMap.put("android.media.metadata.ALBUM_ART_URI", 1);
        arrayMap.put("android.media.metadata.USER_RATING", 3);
        arrayMap.put("android.media.metadata.RATING", 3);
        arrayMap.put("android.media.metadata.DISPLAY_TITLE", 1);
        arrayMap.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        arrayMap.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        arrayMap.put("android.media.metadata.DISPLAY_ICON", 2);
        arrayMap.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        arrayMap.put("android.media.metadata.MEDIA_ID", 1);
        arrayMap.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        arrayMap.put("android.media.metadata.MEDIA_URI", 1);
        arrayMap.put("android.media.metadata.ADVERTISEMENT", 0);
        arrayMap.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new C0022a();
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f58g = bundle2;
        MediaSessionCompat.m39a(bundle2);
    }

    /* JADX INFO: renamed from: a */
    public static MediaMetadataCompat m25a(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mediaMetadataCompatCreateFromParcel.f59h = mediaMetadata;
        return mediaMetadataCompatCreateFromParcel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f58g);
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaMetadataCompat$b */
    public static final class C0023b {

        /* JADX INFO: renamed from: a */
        public final Bundle f60a;

        public C0023b() {
            this.f60a = new Bundle();
        }

        /* JADX INFO: renamed from: a */
        public MediaMetadataCompat m26a() {
            return new MediaMetadataCompat(this.f60a);
        }

        /* JADX INFO: renamed from: b */
        public C0023b m27b(String str, Bitmap bitmap) {
            ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.f57f;
            if ((arrayMap.m15608e(str) >= 0) && arrayMap.getOrDefault(str, null).intValue() != 2) {
                throw new IllegalArgumentException(outline.m1600v("The ", str, " key cannot be used to put a Bitmap"));
            }
            this.f60a.putParcelable(str, bitmap);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0023b m28c(String str, String str2) {
            ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.f57f;
            if ((arrayMap.m15608e(str) >= 0) && arrayMap.getOrDefault(str, null).intValue() != 1) {
                throw new IllegalArgumentException(outline.m1600v("The ", str, " key cannot be used to put a String"));
            }
            this.f60a.putCharSequence(str, str2);
            return this;
        }

        public C0023b(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f58g);
            this.f60a = bundle;
            MediaSessionCompat.m39a(bundle);
        }

        public C0023b(MediaMetadataCompat mediaMetadataCompat, int i) {
            this(mediaMetadataCompat);
            for (String str : this.f60a.keySet()) {
                Object obj = this.f60a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        float f = i;
                        float fMin = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                        m27b(str, Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), true));
                    }
                }
            }
        }
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f58g = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}

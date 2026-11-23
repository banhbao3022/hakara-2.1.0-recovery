package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0024a();

    /* JADX INFO: renamed from: f */
    public final int f61f;

    /* JADX INFO: renamed from: g */
    public final float f62g;

    /* JADX INFO: renamed from: h */
    public Object f63h;

    /* JADX INFO: renamed from: android.support.v4.media.RatingCompat$a */
    public class C0024a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(int i, float f) {
        this.f61f = i;
        this.f62g = f;
    }

    /* JADX INFO: renamed from: a */
    public static RatingCompat m29a(Object obj) {
        RatingCompat ratingCompat;
        float f;
        RatingCompat ratingCompat2 = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat2 = new RatingCompat(ratingStyle, -1.0f);
                        break;
                }
            } else {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = new RatingCompat(1, rating.hasHeart() ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, rating.isThumbUp() ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float starRating = rating.getStarRating();
                        if (ratingStyle == 3) {
                            f = 3.0f;
                        } else if (ratingStyle == 4) {
                            f = 4.0f;
                        } else if (ratingStyle != 5) {
                            Log.e("Rating", "Invalid rating style (" + ratingStyle + ") for a star rating");
                        } else {
                            f = 5.0f;
                        }
                        if (starRating >= 0.0f && starRating <= f) {
                            ratingCompat2 = new RatingCompat(ratingStyle, starRating);
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                        }
                        break;
                    case 6:
                        float percentRating = rating.getPercentRating();
                        if (percentRating >= 0.0f && percentRating <= 100.0f) {
                            ratingCompat2 = new RatingCompat(6, percentRating);
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                        }
                        break;
                    default:
                        return null;
                }
            }
            ratingCompat2.f63h = obj;
        }
        return ratingCompat2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f61f;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Rating:style=");
        sbM1556G.append(this.f61f);
        sbM1556G.append(" rating=");
        float f = this.f62g;
        sbM1556G.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sbM1556G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f61f);
        parcel.writeFloat(this.f62g);
    }
}

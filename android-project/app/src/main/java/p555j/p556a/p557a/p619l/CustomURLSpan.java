package p555j.p556a.p557a.p619l;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* JADX INFO: renamed from: j.a.a.l.b, reason: use source file name */
/* JADX INFO: compiled from: CustomURLSpan.java */
/* JADX INFO: loaded from: classes2.dex */
public class CustomURLSpan extends URLSpan {
    public static final Parcelable.Creator<CustomURLSpan> CREATOR = new a();

    /* JADX INFO: renamed from: j.a.a.l.b$a */
    /* JADX INFO: compiled from: CustomURLSpan.java */
    public class a implements Parcelable.Creator<CustomURLSpan> {
        @Override // android.os.Parcelable.Creator
        public CustomURLSpan createFromParcel(Parcel parcel) {
            return new CustomURLSpan(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public CustomURLSpan[] newArray(int i) {
            return new CustomURLSpan[i];
        }
    }

    public CustomURLSpan(String str) {
        super(str);
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        LinkUtils2.m14254a(getURL(), view.getContext());
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(Color.parseColor("#0288d1"));
    }

    public CustomURLSpan(Parcel parcel, a aVar) {
        super(parcel);
    }
}

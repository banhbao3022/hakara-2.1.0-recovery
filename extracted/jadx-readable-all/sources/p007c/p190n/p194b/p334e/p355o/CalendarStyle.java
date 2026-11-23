package p007c.p190n.p194b.p334e.p355o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p362v.MaterialAttributes;

/* JADX INFO: renamed from: c.n.b.e.o.c, reason: use source file name */
/* JADX INFO: compiled from: CalendarStyle.java */
/* JADX INFO: loaded from: classes.dex */
public final class CalendarStyle {

    /* JADX INFO: renamed from: a */
    public final CalendarItemStyle f25222a;

    /* JADX INFO: renamed from: b */
    public final CalendarItemStyle f25223b;

    /* JADX INFO: renamed from: c */
    public final CalendarItemStyle f25224c;

    /* JADX INFO: renamed from: d */
    public final CalendarItemStyle f25225d;

    /* JADX INFO: renamed from: e */
    public final CalendarItemStyle f25226e;

    /* JADX INFO: renamed from: f */
    public final CalendarItemStyle f25227f;

    /* JADX INFO: renamed from: g */
    public final CalendarItemStyle f25228g;

    /* JADX INFO: renamed from: h */
    public final Paint f25229h;

    public CalendarStyle(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.m11351c(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), C4801b.f24770y);
        this.f25222a = CalendarItemStyle.m11211a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.f25228g = CalendarItemStyle.m11211a(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        this.f25223b = CalendarItemStyle.m11211a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.f25224c = CalendarItemStyle.m11211a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        ColorStateList colorStateListM10961L = C4799a.m10961L(context, typedArrayObtainStyledAttributes, 6);
        this.f25225d = CalendarItemStyle.m11211a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f25226e = CalendarItemStyle.m11211a(context, typedArrayObtainStyledAttributes.getResourceId(7, 0));
        this.f25227f = CalendarItemStyle.m11211a(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f25229h = paint;
        paint.setColor(colorStateListM10961L.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}

package p007c.p190n.p194b.p334e.p355o;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import mtp.media.karaoke.R;

/* JADX INFO: renamed from: c.n.b.e.o.s, reason: use source file name */
/* JADX INFO: compiled from: MonthAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class MonthAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: f */
    public static final int f25296f = UtcDates.m11255e().getMaximum(4);

    /* JADX INFO: renamed from: g */
    public final Month f25297g;

    /* JADX INFO: renamed from: h */
    public final DateSelector<?> f25298h;

    /* JADX INFO: renamed from: i */
    public Collection<Long> f25299i;

    /* JADX INFO: renamed from: j */
    public CalendarStyle f25300j;

    /* JADX INFO: renamed from: k */
    public final CalendarConstraints f25301k;

    public MonthAdapter(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f25297g = month;
        this.f25298h = dateSelector;
        this.f25301k = calendarConstraints;
        this.f25299i = dateSelector.m11221z();
    }

    /* JADX INFO: renamed from: a */
    public int m11242a(int i) {
        return m11243b() + (i - 1);
    }

    /* JADX INFO: renamed from: b */
    public int m11243b() {
        return this.f25297g.m11240u();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i) {
        if (i < this.f25297g.m11240u() || i > m11245d()) {
            return null;
        }
        Month month = this.f25297g;
        int iM11240u = (i - month.m11240u()) + 1;
        Calendar calendarM11252b = UtcDates.m11252b(month.f25289f);
        calendarM11252b.set(5, iM11240u);
        return Long.valueOf(calendarM11252b.getTimeInMillis());
    }

    /* JADX INFO: renamed from: d */
    public int m11245d() {
        return (this.f25297g.m11240u() + this.f25297g.f25293j) - 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m11246e(TextView textView, long j2) {
        CalendarItemStyle calendarItemStyle;
        if (textView == null) {
            return;
        }
        boolean z = false;
        if (this.f25301k.f25202h.mo11210x(j2)) {
            textView.setEnabled(true);
            Iterator<Long> it = this.f25298h.m11221z().iterator();
            while (it.hasNext()) {
                if (UtcDates.m11251a(j2) == UtcDates.m11251a(it.next().longValue())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                calendarItemStyle = this.f25300j.f25223b;
            } else {
                calendarItemStyle = UtcDates.m11254d().getTimeInMillis() == j2 ? this.f25300j.f25224c : this.f25300j.f25222a;
            }
        } else {
            textView.setEnabled(false);
            calendarItemStyle = this.f25300j.f25228g;
        }
        calendarItemStyle.m11212b(textView);
    }

    /* JADX INFO: renamed from: f */
    public final void m11247f(MaterialCalendarGridView materialCalendarGridView, long j2) {
        if (Month.m11236l(j2).equals(this.f25297g)) {
            Calendar calendarM11252b = UtcDates.m11252b(this.f25297g.f25289f);
            calendarM11252b.setTimeInMillis(j2);
            m11246e((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().m11242a(calendarM11252b.get(5)) - materialCalendarGridView.getFirstVisiblePosition()), j2);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return m11243b() + this.f25297g.f25293j;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f25297g.f25292i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x010a  */
    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        CharSequence charSequence;
        CharSequence charSequence2;
        Context context = viewGroup.getContext();
        if (this.f25300j == null) {
            this.f25300j = new CalendarStyle(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iM11243b = i - m11243b();
        if (iM11243b >= 0) {
            Month month = this.f25297g;
            if (iM11243b >= month.f25293j) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                int i2 = iM11243b + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
                Calendar calendarM11252b = UtcDates.m11252b(this.f25297g.f25289f);
                calendarM11252b.set(5, i2);
                long timeInMillis = calendarM11252b.getTimeInMillis();
                int i3 = this.f25297g.f25291h;
                Calendar calendarM11254d = UtcDates.m11254d();
                calendarM11254d.set(5, 1);
                Calendar calendarM11252b2 = UtcDates.m11252b(calendarM11254d);
                calendarM11252b2.get(2);
                int i4 = calendarM11252b2.get(1);
                calendarM11252b2.getMaximum(7);
                calendarM11252b2.getActualMaximum(5);
                calendarM11252b2.getTimeInMillis();
                if (i3 == i4) {
                    Locale locale = Locale.getDefault();
                    if (Build.VERSION.SDK_INT >= 24) {
                        AtomicReference<TimeSource> atomicReference = UtcDates.f25315a;
                        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", locale);
                        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
                        charSequence2 = instanceForSkeleton.format(new Date(timeInMillis));
                    } else {
                        AtomicReference<TimeSource> atomicReference2 = UtcDates.f25315a;
                        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, locale);
                        dateInstance.setTimeZone(UtcDates.m11253c());
                        charSequence2 = dateInstance.format(new Date(timeInMillis));
                    }
                    textView.setContentDescription(charSequence2);
                } else {
                    Locale locale2 = Locale.getDefault();
                    if (Build.VERSION.SDK_INT >= 24) {
                        AtomicReference<TimeSource> atomicReference3 = UtcDates.f25315a;
                        DateFormat instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("yMMMEd", locale2);
                        instanceForSkeleton2.setTimeZone(TimeZone.getTimeZone("UTC"));
                        charSequence = instanceForSkeleton2.format(new Date(timeInMillis));
                    } else {
                        AtomicReference<TimeSource> atomicReference4 = UtcDates.f25315a;
                        java.text.DateFormat dateInstance2 = java.text.DateFormat.getDateInstance(0, locale2);
                        dateInstance2.setTimeZone(UtcDates.m11253c());
                        charSequence = dateInstance2.format(new Date(timeInMillis));
                    }
                    textView.setContentDescription(charSequence);
                }
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        Long item = getItem(i);
        if (item != null) {
            m11246e(textView, item.longValue());
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}

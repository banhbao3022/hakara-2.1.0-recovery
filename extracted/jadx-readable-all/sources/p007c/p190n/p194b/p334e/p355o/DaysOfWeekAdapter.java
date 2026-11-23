package p007c.p190n.p194b.p334e.p355o;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import mtp.media.karaoke.R;

/* JADX INFO: renamed from: c.n.b.e.o.f, reason: use source file name */
/* JADX INFO: compiled from: DaysOfWeekAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class DaysOfWeekAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: f */
    public static final int f25231f;

    /* JADX INFO: renamed from: g */
    public final Calendar f25232g;

    /* JADX INFO: renamed from: h */
    public final int f25233h;

    /* JADX INFO: renamed from: i */
    public final int f25234i;

    static {
        f25231f = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public DaysOfWeekAdapter() {
        Calendar calendarM11255e = UtcDates.m11255e();
        this.f25232g = calendarM11255e;
        this.f25233h = calendarM11255e.getMaximum(7);
        this.f25234i = calendarM11255e.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f25233h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        int i2 = this.f25233h;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f25234i;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.f25232g;
        int i2 = i + this.f25234i;
        int i3 = this.f25233h;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(this.f25232g.getDisplayName(7, f25231f, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.f25232g.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}

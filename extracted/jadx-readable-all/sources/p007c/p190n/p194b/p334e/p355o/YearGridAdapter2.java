package p007c.p190n.p194b.p334e.p355o;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import mtp.media.karaoke.R;

/* JADX INFO: renamed from: c.n.b.e.o.b0, reason: use source file name */
/* JADX INFO: compiled from: YearGridAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class YearGridAdapter2 extends RecyclerView.AbstractC0152e<a> {

    /* JADX INFO: renamed from: d */
    public final MaterialCalendar<?> f25220d;

    /* JADX INFO: renamed from: c.n.b.e.o.b0$a */
    /* JADX INFO: compiled from: YearGridAdapter.java */
    public static class a extends RecyclerView.AbstractC0149b0 {

        /* JADX INFO: renamed from: u */
        public final TextView f25221u;

        public a(TextView textView) {
            super(textView);
            this.f25221u = textView;
        }
    }

    public YearGridAdapter2(MaterialCalendar<?> materialCalendar) {
        this.f25220d = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: d */
    public int mo662d() {
        return this.f25220d.f25238g0.f25204j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: h */
    public void mo666h(RecyclerView.AbstractC0149b0 abstractC0149b0, int i) {
        a aVar = (a) abstractC0149b0;
        int i2 = this.f25220d.f25238g0.f25200f.f25291h + i;
        String string = aVar.f25221u.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        aVar.f25221u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        aVar.f25221u.setContentDescription(String.format(string, Integer.valueOf(i2)));
        CalendarStyle calendarStyle = this.f25220d.f25241j0;
        Calendar calendarM11254d = UtcDates.m11254d();
        CalendarItemStyle calendarItemStyle = calendarM11254d.get(1) == i2 ? calendarStyle.f25227f : calendarStyle.f25225d;
        Iterator<Long> it = this.f25220d.f25237f0.m11221z().iterator();
        while (it.hasNext()) {
            calendarM11254d.setTimeInMillis(it.next().longValue());
            if (calendarM11254d.get(1) == i2) {
                calendarItemStyle = calendarStyle.f25226e;
            }
        }
        calendarItemStyle.m11212b(aVar.f25221u);
        aVar.f25221u.setOnClickListener(new YearGridAdapter(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: i */
    public RecyclerView.AbstractC0149b0 mo667i(ViewGroup viewGroup, int i) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    /* JADX INFO: renamed from: n */
    public int m11213n(int i) {
        return i - this.f25220d.f25238g0.f25200f.f25291h;
    }
}

package p636z0.p743l.p744a;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: renamed from: z0.l.a.b, reason: use source file name */
/* JADX INFO: compiled from: CursorFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class CursorFilter extends Filter {

    /* JADX INFO: renamed from: a */
    public a f38145a;

    /* JADX INFO: renamed from: z0.l.a.b$a */
    /* JADX INFO: compiled from: CursorFilter.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo14953a(Cursor cursor);

        /* JADX INFO: renamed from: b */
        CharSequence mo14954b(Cursor cursor);

        /* JADX INFO: renamed from: c */
        Cursor mo14955c(CharSequence charSequence);
    }

    public CursorFilter(a aVar) {
        this.f38145a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f38145a.mo14954b((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorMo14955c = this.f38145a.mo14955c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorMo14955c != null) {
            filterResults.count = cursorMo14955c.getCount();
            filterResults.values = cursorMo14955c;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f38145a;
        Cursor cursor = ((CursorAdapter) aVar).f38137h;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        aVar.mo14953a((Cursor) obj);
    }
}

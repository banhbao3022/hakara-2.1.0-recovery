package p636z0.p743l.p744a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.p653h.SuggestionsAdapter;

/* JADX INFO: renamed from: z0.l.a.a, reason: use source file name */
/* JADX INFO: compiled from: CursorAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class CursorAdapter extends BaseAdapter implements Filterable, CursorFilter.a {

    /* JADX INFO: renamed from: f */
    public boolean f38135f;

    /* JADX INFO: renamed from: g */
    public boolean f38136g;

    /* JADX INFO: renamed from: h */
    public Cursor f38137h;

    /* JADX INFO: renamed from: i */
    public Context f38138i;

    /* JADX INFO: renamed from: j */
    public int f38139j;

    /* JADX INFO: renamed from: k */
    public a f38140k;

    /* JADX INFO: renamed from: l */
    public DataSetObserver f38141l;

    /* JADX INFO: renamed from: m */
    public CursorFilter f38142m;

    /* JADX INFO: renamed from: z0.l.a.a$a */
    /* JADX INFO: compiled from: CursorAdapter.java */
    public class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Cursor cursor;
            CursorAdapter cursorAdapter = CursorAdapter.this;
            if (!cursorAdapter.f38136g || (cursor = cursorAdapter.f38137h) == null || cursor.isClosed()) {
                return;
            }
            cursorAdapter.f38135f = cursorAdapter.f38137h.requery();
        }
    }

    /* JADX INFO: renamed from: z0.l.a.a$b */
    /* JADX INFO: compiled from: CursorAdapter.java */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            CursorAdapter cursorAdapter = CursorAdapter.this;
            cursorAdapter.f38135f = true;
            cursorAdapter.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            CursorAdapter cursorAdapter = CursorAdapter.this;
            cursorAdapter.f38135f = false;
            cursorAdapter.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public CursorAdapter(Context context, Cursor cursor) {
        m16363e(context, cursor, 1);
    }

    /* JADX INFO: renamed from: a */
    public void mo14953a(Cursor cursor) {
        Cursor cursor2 = this.f38137h;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f38140k;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.f38141l;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f38137h = cursor;
            if (cursor != null) {
                a aVar2 = this.f38140k;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.f38141l;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f38139j = cursor.getColumnIndexOrThrow("_id");
                this.f38135f = true;
                notifyDataSetChanged();
            } else {
                this.f38139j = -1;
                this.f38135f = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* JADX INFO: renamed from: b */
    public CharSequence mo14954b(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    /* JADX INFO: renamed from: c */
    public Cursor mo14955c(CharSequence charSequence) {
        return this.f38137h;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo14956d(View view, Context context, Cursor cursor);

    /* JADX INFO: renamed from: e */
    public void m16363e(Context context, Cursor cursor, int i) {
        if ((i & 1) == 1) {
            i |= 2;
            this.f38136g = true;
        } else {
            this.f38136g = false;
        }
        boolean z = cursor != null;
        this.f38137h = cursor;
        this.f38135f = z;
        this.f38138i = context;
        this.f38139j = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f38140k = new a();
            this.f38141l = new b();
        } else {
            this.f38140k = null;
            this.f38141l = null;
        }
        if (z) {
            a aVar = this.f38140k;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f38141l;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public View mo16364f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo14957i(context, cursor, viewGroup);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f38135f || (cursor = this.f38137h) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f38135f) {
            return null;
        }
        this.f38137h.moveToPosition(i);
        if (view == null) {
            view = mo16364f(this.f38138i, this.f38137h, viewGroup);
        }
        mo14956d(view, this.f38138i, this.f38137h);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f38142m == null) {
            this.f38142m = new CursorFilter(this);
        }
        return this.f38142m;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f38135f || (cursor = this.f38137h) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f38137h;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f38135f && (cursor = this.f38137h) != null && cursor.moveToPosition(i)) {
            return this.f38137h.getLong(this.f38139j);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f38135f) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f38137h.moveToPosition(i)) {
            throw new IllegalStateException(outline.m1590l("couldn't move cursor to position ", i));
        }
        if (view == null) {
            view = mo14957i(this.f38138i, this.f38137h, viewGroup);
        }
        mo14956d(view, this.f38138i, this.f38137h);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return !(this instanceof SuggestionsAdapter);
    }

    /* JADX INFO: renamed from: i */
    public abstract View mo14957i(Context context, Cursor cursor, ViewGroup viewGroup);

    public CursorAdapter(Context context, Cursor cursor, boolean z) {
        m16363e(context, cursor, z ? 1 : 2);
    }

    public CursorAdapter(Context context, Cursor cursor, int i) {
        m16363e(context, cursor, i);
    }
}

package p636z0.p743l.p744a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: z0.l.a.c, reason: use source file name */
/* JADX INFO: compiled from: ResourceCursorAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ResourceCursorAdapter extends CursorAdapter {

    /* JADX INFO: renamed from: n */
    public int f38146n;

    /* JADX INFO: renamed from: o */
    public int f38147o;

    /* JADX INFO: renamed from: p */
    public LayoutInflater f38148p;

    @Deprecated
    public ResourceCursorAdapter(Context context, int i, Cursor cursor) {
        super(context, cursor);
        this.f38147o = i;
        this.f38146n = i;
        this.f38148p = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p636z0.p743l.p744a.CursorAdapter
    /* JADX INFO: renamed from: f */
    public View mo16364f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f38148p.inflate(this.f38147o, viewGroup, false);
    }

    @Override // p636z0.p743l.p744a.CursorAdapter
    /* JADX INFO: renamed from: i */
    public View mo14957i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f38148p.inflate(this.f38146n, viewGroup, false);
    }

    @Deprecated
    public ResourceCursorAdapter(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f38147o = i;
        this.f38146n = i;
        this.f38148p = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public ResourceCursorAdapter(Context context, int i, Cursor cursor, int i2) {
        super(context, cursor, i2);
        this.f38147o = i;
        this.f38146n = i;
        this.f38148p = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}

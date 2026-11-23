package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p636z0.p644b.p651g.p652i.MenuBuilder;
import p636z0.p644b.p651g.p652i.MenuView;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements MenuView {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    @Override // p636z0.p644b.p651g.p652i.MenuView
    /* JADX INFO: renamed from: b */
    public void mo151b(MenuBuilder menuBuilder) {
    }

    public int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }
}

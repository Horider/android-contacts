package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.Nullable;

public interface ListDiffInterface<T> {

    boolean theSameAs(T ListDiffInterface);

    boolean equals(@Nullable Object obj);
}

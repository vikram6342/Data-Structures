
def heapify(arr,n,i):
    l=i*2+1
    r=i*2+2
    smallest=i

    if l<n and arr[smallest]<arr[l]:
        smallest=l
    if r<n and arr[smallest]<arr[r]:
        smallest=r
    if smallest !=i:
        arr[smallest],arr[i]=arr[i],arr[smallest]
        heapify(arr,n,smallest)

def build_heap(arr):
    n=len(arr)
    for i in range(n//2,-1,-1):
        heapify(arr,n,i)
    return arr

def delete_Root(arr,n):
    arr[0],arr[n-1]=arr[n-1],arr[0]
    n=n-1
    heapify(arr,n,0)
    print(f"root element is :{arr[n-1]}")

def heap_sort(arr):
    n=len(arr)
    for i in range(n,0,-1) :
        delete_Root(arr,i)
    print(arr)

arr=[1,8,5,6,7,9,4,2]
print(build_heap(arr))
heap_sort(arr)